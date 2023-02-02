package com.abstraction.example;

import java.util.Date;

public class PhdStudent extends GraduateStudent {

	public PhdStudent(int no, String name, int year, Date dob, String major) {
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
		super.writeThesis();
	}

	 // We can not override static and final methods
	//@Override
	static void meetWithAdvisor() {
		// TODO Auto-generated method stub
		System.out.println("PHD  Student  is meeting with Advisor.");
	}
	
	public void writePaper()
	{
		System.out.println("PHD  Student  is writing paper.");
		
	}

	
	
}
