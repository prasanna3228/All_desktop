package com.java.inheritance;

public class Admin extends Developer {

//	public void read() {
//		System.out.println("Read code");
//	}
//	
//	public void write() {
//		System.out.println();
//	}
	
	public void manage() {
		super.read();
		write();
		System.out.println("manage code");
	}
	
	public void read() {
		System.out.println("Admin read speciallly ");
	}
}
