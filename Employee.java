package com.greatlearning.ITservice;
import java.util.Scanner;

public class Employee {
	private  String FirstName;
	private  String LastName;
	private String password;
	private String department;
	private String email;
	private int defaultpasswordlength=10;
	private String companySuffix="company.com";
	
	// parameterized Employee constructor to pass FirstName and LastName
	
	public Employee(String FirstName, String LastName)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		// System.out.println("Email is created :" +this.FirstName+ " "+this.LastName);
	
	//call to identify the department
		this.department=setDepartment();
		// call to generateEmailAddress method
		this.email=generateEmailAddress();
		System.out.println("Dear" +FirstName + " your credentials are as follows");
		System.out.println(" email------> " +email);
		//call to generate password
		this.password=generatePassword(defaultpasswordlength);
		System.out.println("password-----> "+this.password+ "\n \n");
					
	}
		
	private String setDepartment()
	
	{   Scanner sc=new Scanner(System.in);
		System.out.println ("Please Enter the Department from the following");
		System.out.println("\n 1.Technical");
		System.out.println("\n 2.Admin");
		System.out.println("\n 3.Human Resource");
		System.out.println("\n 4.Legal");
		System.out.println("\n 5.Default Choice");
		int choice=sc.nextInt();
		
		if(choice==1)
		{
		 return "tech";
		}
		 else if (choice==2)
		{
			return "admin";
		}
		
		 else if (choice== 3)
				{ 
			 return "hr";
				}
		
		 else if (choice==4)
			 {
			 return "legal";
			 }
				
		 else 
		 {			 return "Default Choice";
		 }
		
	}
	
	private String generateEmailAddress()
	{
		email=FirstName.toLowerCase()+""+LastName.toLowerCase()+"@"+department+"."+companySuffix;
		return email;
	}
	private String generatePassword(int length)
	{
		String passwordset= "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password=new char[length];
		for(int i=0;i<length;i++)
		{
			int rand=(int) (Math.random()*passwordset.length());
			password[i]=passwordset.charAt(rand);
			
		}
		return new String(password);
		
			
		}
	
		public String ShowCredentials()
		{ //System.out.println("Dear" +FirstName + "your generated credentials are as follows ");
		
			return "DISPLAY NAME:" +FirstName+ " "+LastName+ "\n Email---->" +email+ "\n"+ "password---->" +password;
			
		}

}

		
	


