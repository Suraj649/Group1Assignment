package org.student;

//importing Department package for calling Department related methods
import org.department.Department;

public class Student extends Department {
	
	public static void main(String[] args) {
		//creating object for Student class
		Student details = new Student();
		//calling method from super class College
		details.collegeName();
		details.collegeCode();
		details.collegeRank();
		
		//Calling  method from sub class1 Department
		details.deptName();
		details.studentName();
		
		//calling method from Student class
		details.studentDept();
		details.studentId();
	}
	//creating method studentName()
	public void studentName() {
		System.out.println("Suraj Prasad");
	}
	//creating method studentDept()
	public void studentDept() {
		System.out.println("Information Technology");
	}
	//creating method studentId()
	public void studentId() {
		System.out.println("STID47");
	}
	
	
}
