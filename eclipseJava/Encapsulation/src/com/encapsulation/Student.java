package com.encapsulation;

public class Student {

		int rollNumber;
		String name;
		boolean isAttended;
		
	public Student(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	
	public void setStudentAttendence(boolean flag) {
		isAttended=flag;
		System.out.println("Teacher addigned attendece");
	}
	
	public boolean getStudentAttendence() {
		System.out.println("Teacher accessed student attendence");
		return isAttended;
	}

}
