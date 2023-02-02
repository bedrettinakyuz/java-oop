package com.abstraction.example;

import java.text.SimpleDateFormat;


public class AbstractionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Student student ;
		//dinamic binding
		RegistrationOffice rof = new RegistrationOffice();
		student =  rof.getAStudent();
		System.out.println(student.toString());

		
		
		//instanceOf
		Student iStudent = rof.getAStudent();
		if(iStudent instanceof GraduateStudent) {
			//Downcasting
			GraduateStudent gStudent = (GraduateStudent) iStudent;
			gStudent.meetWithAdvisor();
			
		}
		
		
        
		MasterStudent masterStudent = new MasterStudent(61, "Berkay", 2022,  new SimpleDateFormat("yyyy-MM-dd").parse("1995-10-10"), "CENG");
		masterStudent.toString();
		masterStudent.writeThesis();
		masterStudent.meetWithAdvisor();
		System.out.println(masterStudent.toString());
		
		
		
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
