package com.abstraction.example;

import java.util.Date;

public class MasterStudent extends GraduateStudent {

	public MasterStudent(int no, String name, int year, Date dob, String major) {
		super(no, name, year, dob, major);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		super.study();
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		super.register();
	}

	@Override
	public void writeThesis() {
		// TODO Auto-generated method stub
		System.out.println("Master Student Student  is writing theisis.");
	}

	//@Override
	 // We can not override static and final methods
	static void meetWithAdvisor() {
		// TODO Auto-generated method stub
		System.out.println("Master Student Student  is meeting  Advisor.");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	

	
	
	
}



