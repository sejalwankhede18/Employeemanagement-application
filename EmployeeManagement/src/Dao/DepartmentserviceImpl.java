package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import java.util.ArrayList;

import Model.Department;
import exception.DepartmentNotFoundException;
import util.DBconn;




public class DepartmentserviceImpl implements Departmentservice{// class
	
	private static final Statement DBcon = null;
	public List<Department> getAllDepartmentss(){
		// get all details
	List<Department> list =new ArrayList<>();//object created
	String query="Select * from Department";
	try(Connection con=DBconn.getConnection();
		PreparedStatement ps=con.prepareStatement(query))
	{
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			//list.add(new Department(rs.getInt("deptid"),rs.getString("deptname")));
		int departmentID = rs.getInt("deptid");
        String departmentName = rs.getString("deptname");
        System.out.println("ID: " + departmentID + ", Name: " + departmentName);
        
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	return list;

  }

	@Override
	public Department getDept(int deptid) {
 
			String sql = "SELECT * FROM Department WHERE deptid = ?";
			Department dept = null;
	        try(Connection conn = DBconn.getConnection();
	            PreparedStatement stmt = conn.prepareStatement(sql)) {
	            stmt.setInt(1, deptid);
	            ResultSet rs = stmt.executeQuery();
	            int departmentID=0;
	            if(rs!=null)
	            {
	            while(rs.next())
 
				{
					//list.add(new Department(rs.getInt("deptid"),rs.getString("deptname")));
 
	            departmentID = rs.getInt("deptid");
	            String departmentName = rs.getString("deptname");
	            System.out.println("ID: " + departmentID + ", Name: " + departmentName);
 
				}
 
	            }
	            if(departmentID != deptid)
		            throw new DepartmentNotFoundException("Department with depid: " + deptid + " not found");
		            return dept;
	        }
	        catch (DepartmentNotFoundException e) {
	        	System.out.println(e.getMessage());
	        }
	        catch (Exception e) {
	            System.out.println("Error Occurred : " + e.getMessage());
 
	        }
	           /* if(departmentID != deptid)
	            throw new Exception("Department with depid: " + deptid + " not found");
	            return dept;
	        } catch (SQLException e) {
	            System.out.println("Error Occurred 2: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Error Occurred : " + e.getMessage());
	
	        }*/
	        return null;
 
		
	}

	@Override
	public Department getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
    
	private final String JDBC_URL = "jdbc:mysql://localhost:3306/JDBCtask";
    private final String JDBC_USER = "root";
    private final String JDBC_PASSWORD = "sejal@babita2004";

    @Override
    public boolean deleteDepartment1(int deptId) {
        String sql = "DELETE FROM department WHERE dept_id = ?";
        Department dept = null;
        try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, deptId);
            int rowsAffected = stmt.executeUpdate();
            ResultSet rs = null;
			if (!rs.next()) {
                throw new DepartmentNotFoundException("Department with deptid: " + deptId + " not found");
            }

            return rowsAffected > 0;  // returns true if at least 1 row is deleted

        } catch (DepartmentNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error occurred while deleting department: " + e.getMessage());
        }
 
        
            return false;
        }
    
	@Override
	public Boolean deleteDepartment(int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteDepartment11(int deptId) {
		// TODO Auto-generated method stub
		return false;
	}
 
	

	
//	public Department getDept(int deptid) throws Exception {
//		// TODO Auto-generated method stub
//		return null;
//	}
}


