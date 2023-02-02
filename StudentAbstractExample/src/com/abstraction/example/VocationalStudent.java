package com.abstraction.example;

import java.util.Date;

public class VocationalStudent extends Student {

	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		System.out.println("Vocational Student is studying.");
		
	}

	@Override
	public void register() {
		System.out.println("Vocational Student is registering.");
		
	}

	@Override
	public String toString() {
		
		 return "Vocational Student [ Vocational Student name : " + name +",year : " + year + "Date of Birth : " + dob + "Major : " + major + "]";
	}

}
