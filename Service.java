package com.greatlearning.ITservice;

public class Service {

	public static void main(String[] args)
	
	{
		
		Employee employee1=new Employee("Jayshri", "Kulkarni");
		
		Employee employee2=new Employee("John", "Moew");
		System.out.println(employee1.ShowCredentials());
		
		System.out.println(employee2.ShowCredentials());
		
	}

}
