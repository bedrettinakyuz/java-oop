package com.abstraction.example;

import java.util.Date;

public class UndergraduateStudent extends Student {

	
	
	public UndergraduateStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Undergraduate Student [name : " + name +", Year : " + year + " Date of Birth : " + dob + " Major : " + major + "]";
	}

	
}
