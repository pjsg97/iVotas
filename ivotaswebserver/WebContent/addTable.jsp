<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html  lang="en">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>IVotas</title>
	<!-- CSS -->
	<link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="assets/css/admin.css">
	<!--           -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	<script src="assets/js/admin.js"></script>
</head>
<body>
	<div class="container">
	    <div class="row">
	        <div class="col-md-3">
	            <ul class="nav nav-pills nav-stacked admin-menu">
	                <li><a href="<s:url action="homePage"/>" id="home" action="adminPage">Home</a></li>
	                <li><a href="<s:url action="registerPage"/>" id="register" >Register User</a></li>
	                <li><a href="<s:url action="newElectionPage"/>" id="newElections" >Create Election</a></li>
	                <li><a href="<s:url action="changeElectionPage"/>" id="elections" >Change Election</a></li>
	                <li><a href="<s:url action="electionResultsPage"/>" id="electionResults" >Past Election Results</a></li>
	                <li><a href="<s:url action="electionDetailsPage"/>" id="electionInfo">Election Info</a></li>
	                <li><a href="<s:url action="userVotePage"/>" id="userVote">User Vote Info</a></li>
	                <li class="active"><a href="<s:url action="manageTable"/>" id="manageTable">Manage Tables</a></li>  
	                <li><a href="<s:url action="tablesPage"/>"id="tables" >Online Tables</a></li>
	            </ul>
	        </div>
	        <div class="col-md-9 well admin-content" id="addTable">
	            <div id="signupbox" style="margin-top:50px" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
                    <div class="panel panel-primary">
                        <div class="panel-heading">
                            <div class="panel-title">Assign Table</div>
                        </div>  
                        <div class="panel-body" >

                                    
						<c:choose>
							<c:when test="${sessionBean.getTables().size() > 0 && sessionBean.getFutureElections().size() > 0}">
							  <form id="signupform" class="form-horizontal" role="form" action="addtable" method="POST">
                                <div id="signupalert" style="display:none" class="alert alert-danger">
                                    <p>Error:</p>
                                    <span></span>
                                </div>
                                <div class="form-group">
                                		<label for="dep" class="col-sm-4 control-label">Department</label>
				                    <div class="col-sm-4">
                                    <select id="tableId" name="tableId" class="form-control">
                                    <option value="" disabled selected>Table</option>
									  <c:forEach items="${sessionBean.getTables()}" var="table">
									    <option value="${table.getId()}">
									    		${table.getDepartment().getName()}
    									    </option> 
									  </c:forEach>
									</select>
									</div>
                                </div>

                                <div class="form-group">
                                		<label for="dep" class="col-sm-4 control-label">Election</label>
				                    <div class="col-sm-4">
                                    <select id="electionId" name="electionId" class="form-control">
                                    <option value="" disabled selected>Election</option>
									  <c:forEach items="${sessionBean.getFutureElections()}" var="election">
									    <option value="${election.getId()}">
									    		${election.getName()}
    									    </option> 
									  </c:forEach>
									</select>
									</div>
                                </div>

                                <div class="form-group">
                                    <!-- Button -->                                        
                                    <div class="col-md-offset-3 col-md-9">
                                        <button id="btn-signup" type="submit" class="btn btn-primary"onclick="document.getElementById('signupform').submit()"><i class="icon-hand-right"></i> &nbsp Create</button>
                                    </div>
                                </div>
                                
                                
                                </form>
                                
                          </c:when>
                          <c:otherwise>
								<tr><td>
									Missing tables or no current elections ...
								</td></tr>
							</c:otherwise>
						</c:choose>
                         </div>
                    </div>
                </div>
         	</div> 
	    </div>
	</div>
</body>
</html>