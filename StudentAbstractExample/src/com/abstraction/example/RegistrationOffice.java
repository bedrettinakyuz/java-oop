package com.abstraction.example;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RegistrationOffice {


	
	
	public Student getAStudent() {
		try {
		Student student ;
		Random rand = new Random();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date dob = format.parse("02-02-1995");
		int rand_int1 = rand.nextInt(3)+1;
		
		
		switch(rand_int1)
		{

		case 1:	
			student = new  GraduateStudent(1,"kadir",rand_int1,dob,"control engineer");
			break;
		
		case 2:
			student = new  UndergraduateStudent(1,"kadir",rand_int1,dob,"control engineer");
			break;
		case 3:
			student = new VocationalStudent(1,"kadir",rand_int1,dob,"control engineer");
			break;
		default:
			student = new VocationalStudent(1,"kadir",rand_int1,dob,"control engineer");
			break;
		}
		
		return student;
		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	

}
