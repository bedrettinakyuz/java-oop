package com.abstraction.example;

import java.util.Date;

public class GraduateStudent extends Student {

	protected String advisor ;
	protected String thesis;
	public GraduateStudent(int no, String name, int year, Date dob, String major) {
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

	public void writeThesis()
	{
		System.out.println("Graduate Student Student  is writing theisis.");
	}
	
	static void meetWithAdvisor()
	{
		System.out.println("Graduate Student Student  is meeting  advisor.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Graduate Student [ name : " + name +",year : " + year + "Date of Birth : " + dob + "Major : " + major + "]";
	}


}
