package main;
import java.util.*;

import Dao.DepartmentserviceImpl;
import util.DBconn;
import util.DButil;
public class EmployeeManagement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int option;
		System.out.println("1. Display all department details");
		System.out.println("2. Display department details by dept id");
		System.out.println("3. Delete department from dept id");
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Choose the Options :");
		option = s1.nextInt();
		
		switch(option) {
		case 1 :
			System.out.println("department details are :");
			 DepartmentserviceImpl obj = new  DepartmentserviceImpl();
			 obj.getAllDepartmentss();
			break;
		case 2 :
			DepartmentserviceImpl obj1 = new  DepartmentserviceImpl();
			System.out.println("enter dept id :");
			Scanner s2 = new Scanner(System.in);
			int id = s2.nextInt();
			obj1.getDept(id);
			break;
		case 3 :
			DepartmentserviceImpl obj2 = new  DepartmentserviceImpl();
			System.out.println("enter dept id :");
			Scanner s3 = new Scanner(System.in);
			int id1 = s3.nextInt();
			obj2.deleteDepartment1(id1);
			break;
		default:
			System.out.println("invalid option");
			
		}
		
	}

}
