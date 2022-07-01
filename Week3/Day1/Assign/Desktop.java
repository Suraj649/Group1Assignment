package org.system;

public class Desktop extends Computer{
	 
	public void desktopSize() {
		System.out.println("printing desktop size");
	}
	
	public static void main(String[] args) {
		Desktop computer = new Desktop();
		computer.computerModel();
		computer.desktopSize();
	}
	
}
