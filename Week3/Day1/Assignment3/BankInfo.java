package org.bank;

public class BankInfo {
	
	public static void main(String[] args) {
		BankInfo bank = new AxisBank();
		bank.deposit();
		
	}
	//Creating method saving()
	public void saving() {
		System.out.println("Savings Account");
	}
	
	//Creating method fixed()
	public void fixed() {
		System.out.println("Fixed Account");
	}
	
	//Creating method deposit()
	public void deposit() {
		System.out.println("Deposit Account");
	}
}
