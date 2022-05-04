package com.bridgelabz2;

public class EmployeeWageBuilder {
	
	public static void main(String[] args) {
		//constant
		int IS_FULL_TIME=1;
		
		int EMP_RATE_TIME=1;
		int EMP_RATE_PER_HOUR=20;
		//variables
		int empHrs=0;
		int empWage=0;
		//computation
		
	//check emp daily wage
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck==IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;
		
		empWage=empHrs*EMP_RATE_PER_HOUR;
		
			System.out.println("Employee wage:"+empWage);
		
	}

}
