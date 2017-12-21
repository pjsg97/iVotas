package action;

import com.opensymphony.xwork2.ActionSupport;

import model.SessionBean;

import org.apache.struts2.interceptor.SessionAware;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.Map;

public class AddTableAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 4612369273739161719L;
	private int tableId;
	private int electionId;
	private Map<String,Object> session;
	@Override
	public String execute() {
		try{
			System.out.println("table:" +tableId + " election: " +electionId );
			this.getSessionBean().assignTable( tableId,  electionId);
			return SUCCESS;
		}catch(RemoteException e){
			return ERROR;
		}
	}
	
	public SessionBean getSessionBean(){
		if(!session.containsKey("sessionBean"))
			this.setSessionBean(new SessionBean());
		return (SessionBean) session.get("sessionBean");
	}
	
	public void setSessionBean(SessionBean sessionBean){
		this.session.put("sessionBean", sessionBean);
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getTableId() {
		return tableId;
	}

	public void setTableId(int tableId) {
		this.tableId = tableId;
	}

	public int getElectionId() {
		return electionId;
	}

	public void setElectionId(int electionId) {
		this.electionId = electionId;
	}

	
	
}
