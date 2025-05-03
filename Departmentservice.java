package Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import Model.Department;

public interface Departmentservice {// interface
	Statement DBConnUtil = null;
	// get all details from department table
	// we need List ---> under collections
	public List<Department> getAllDepartmentss();
//	Department getDept(int deptid) throws Exception;
	Department getDepartmentById(int id);
	Department getDept(int deptid);
	
	Boolean deleteDepartment(int deptId);
	boolean deleteDepartment1(int deptId);
	boolean deleteDepartment11(int deptId);
	
 
}
