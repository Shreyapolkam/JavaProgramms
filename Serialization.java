package com.codegnan.Files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements  Serializable{
	private int empID;
    private String empName;
    private int empSalary;
    private String empLocation;
    
    public Employee(int empID, String string, int j, String string2) {
		// TODO Auto-generated constructor stub
	}
	public void Employee(int empID,String empName,int empSalary,String empLocation) {
    	this.empID = empID;
    	this.empName = empName;
    	this.empSalary = empSalary;
    	this.empLocation = empLocation;
    	
    
    	
    }
    public void getEmpDetailes () {
    	System.out.println("Employee ID " + empID);
    	System.out.println("Employee Name " + empName);
    	System.out.println("Employee Salary " + empSalary);
    	System.out.println("Employee Location " + empLocation);
    	
    }
}

    public class Serialization {
    	public static void main(String[] args) throws Exception {
    		
    		//step 1 
    		FileOutputStream fos = new FileOutputStream("E:/emp.ser");
    		
    		//step2 
    		
    		ObjectOutputStream oos = new ObjectOutputStream(fos);
    		
    		//step3
    		Employee employee = new Employee (111, "Shreya" , 20000, "hyd" );
    		System.out.println("employee details before serialization :");
    		employee.getEmpDetailes();
    		
    		//writing an object to a file
    		
    		oos.writeObject(employee);
    		
    		System.out.println("serialized employee object " +employee);
    		System.out.println();
    		
    		oos.close();
    		fos.close();
    		System.out.println("Seialization ended");
    		System.out.println("========================================================");
    		
    		//deserialization 
    		System.out.println("Deserialization Started ");
    		
    		//create file in[it strram
    		FileInputStream fileInputStream = new FileInputStream("E:/emp.ser");
    		
    		//file to object 
    		ObjectInputStream ois = new ObjectInputStream(fileInputStream);
    		
    		//read the file  to an object 
    		
    		Employee employee1  = (Employee)ois.readObject();
    		System.out.println("after deserialized employee detials ");
    		employee1.getEmpDetailes();
    		System.out.println("deserialized employee object " +employee1);
    		System.out.println();
    		fileInputStream.close();
    		ois.close();
    		System.out.println("DeSeialization ended");
    		
    		
/*import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
// Define a Serializable class Employee
class Employee implements Serializable {
 	private static final long serialVersionUID = 1L; // Ensure compatibility during serialization
 	private int empId;
 	private String empName;
 	private float empSalary;
 	private String empLocation;
 
 	// Constructor
 	public Employee(int empId, String empName, float empSalary, String empLocation) {
      	this.empId = empId;
      	this.empName = empName;
      	this.empSalary = empSalary;
      	this.empLocation = empLocation;
 	}
 
 	// Method to display employee details
 	public void getEmpDetails() {
      	System.out.println("Employee ID: " + empId);
      	System.out.println("Employee Name: " + empName);
      	System.out.println("Employee Salary: " + empSalary);
      	System.out.println("Employee Location: " + empLocation);
 	}
}
 
public class Serialization {
 	public static void main(String[] args) throws Exception {
      	// Serialization: Writing an Employee object to a file
      	FileOutputStream fileOutputStream = new FileOutputStream("E:/emp.txt");
      	ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
 
      	// Creating an Employee object
      	Employee employee1 = new Employee(111, "malli", 50000.0f, "Hyd");
      	System.out.println("Employee Details before Serialization:");
      	employee1.getEmpDetails();
 
      	// Writing the Employee object to file
 		objectOutputStream.writeObject(employee1);
      	System.out.println("Serialized Employee Object: " + employee1);
      	System.out.println();
 
      	// Close output streams after writing
      	objectOutputStream.close();
      	fileOutputStream.close();
 
      	// Deserialization: Reading an Employee object from a file
      	FileInputStream fileInputStream = new FileInputStream("E:/emp.txt");
      	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
 
      	// Reading the Employee object from file
      	Employee employee2 = (Employee) objectInputStream.readObject();
      	System.out.println("Employee Details after Deserialization:");
      	employee2.getEmpDetails();
      	System.out.println("Deserialized Employee Object: " + employee2);
 
      	// Close input streams after reading
      	objectInputStream.close();
      	fileInputStream.close();*/
 	}
}

    	     
    		
    	
    

