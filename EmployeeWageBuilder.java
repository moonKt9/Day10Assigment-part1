package com.bridgelabz2;

public class EmployeeWageBuilder {
	
	public static void main(String[] args) {
		//constant
		int IS_FULL_TIME=1;
	//check emp is present or absent
		double empCheck=Math.floor(Math.random()*10)%2;
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}

}
