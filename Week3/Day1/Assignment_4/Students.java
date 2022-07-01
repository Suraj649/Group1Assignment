package org.student;

public class Students {
	
	public static void main(String[] args) {
		Students details= new Students();
		details.getStudentInfo(47, "Suraj Prasad");
	}
	
	//Creating method getStudentInfo() with id argument
	public void getStudentInfo(int id) {
		System.out.println(id);
	}
	
	//Overloading method getStudentInfo() with id and name argument
	public void getStudentInfo(int id,String name) {
		System.out.println(id);
		System.out.println(name);
	}
	
	//Overloading method getStudentInfo() with email id and phone number argument
	public void getStudentInfo(String email,long phone) {
		System.out.println(email);
		System.out.println(phone);
	}
}
