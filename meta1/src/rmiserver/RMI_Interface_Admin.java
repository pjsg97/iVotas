package rmiserver;

import java.rmi.*;
import java.util.*;
public interface RMI_Interface_Admin extends Remote{
    public boolean register(String name, String username, String password, int type, int id_faculty, int id_departement, String address, int num_id, int month_id, int year_id, String phoneNumber)throws RemoteException;
    public void addDepartment(String name, int id_faculty)throws RemoteException;
    public void addFaculty(String name)throws RemoteException;
    public void changeDepartment(String newName, int id)throws RemoteException;
    public void changeFaculty(String newName, int id)throws RemoteException;
    public boolean deleteDepartment(int id)throws RemoteException;
    public boolean deleteFaculty(int id)throws RemoteException;
    public boolean createElection(Date startDate, Date endDate, String name, String desc, int id_department)throws RemoteException;
    public void removeList(int id) throws RemoteException;
    public int getDepartmentNumber(int id)throws RemoteException;
    public int getListType(int id)throws RemoteException;
    public boolean checkDepartment(int id)throws RemoteException;
    public boolean checkFaculty(int id)throws RemoteException;
    public int checkUserType(int id)throws RemoteException;
    public void createList(String name, int type, int election) throws RemoteException;
    public void changeElectionName(int id, String name) throws RemoteException;
    public void changeElectionEndDate(int id, Date endDate) throws RemoteException;
    public void changeElectionStartDate(int id, Date startDate) throws RemoteException;
    public void changeElectionDescription(int id, String desc) throws RemoteException;
    public ArrayList<Election> getUserVotedElections(int id) throws RemoteException;
    public Vote getUserVoteDetails(int id, int election) throws RemoteException;
    public HashMap<String, Integer> getElectionResults(int id)throws RemoteException;
    public ArrayList<Department> getAllDepartments() throws RemoteException;
    public HashMap<String, Integer> getAllFaculties() throws RemoteException;
    public ArrayList<Election> getPastElections() throws RemoteException;
    public ArrayList<Election> getAllElections() throws RemoteException;
    public ArrayList<Lista> getElectionLists(int election) throws RemoteException;
    public void addCandidatesToList(int list, ArrayList<Integer> users) throws RemoteException;
    public ArrayList<Department> getDepartmentsFromFaculty(int faculty) throws RemoteException;
    public ArrayList<User> getUsers() throws RemoteException;
    public void setAdmin(Admin_Interface_RMI admin)throws RemoteException;
    public List<Integer> getOnlineTables() throws RemoteException;
    public void deleteVotingTable(int election, int table) throws RemoteException;
    public boolean addVotingTable(int election, int table) throws RemoteException;
    public ArrayList<Integer> getElectionTables(int election) throws RemoteException;
    public boolean updateUser(int user,String name, int faculty, int department, String address, int num_id, int month_id, int year_id, String phoneNumber) throws RemoteException;
    public int login(String username, String password )throws RemoteException;
    public HashMap<Integer, String> getEarlyElections(int usertype) throws RemoteException;
    public HashMap<Integer, String> getListsEarlyElections(int usertype, int idElection) throws RemoteException;
    public boolean earlyVote(int userId, int userType, int userDep, int election, int vote) throws RemoteException;
    public HashMap<String, Integer> getUserId(String username) throws RemoteException;
    
    public int checkUserDep(int id) throws RemoteException;
    public void editListType(int listId,int userType) throws RemoteException;
    
}
