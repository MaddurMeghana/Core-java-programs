package com.Edubridge;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int eid;
		String ename;
		int basicsalary=0 ,presentdays=0;
		int totalsalary;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Employee id:");
		eid=sc.nextInt();
		
		System.out.println("Enter Employee name:");
		ename=sc.next();
		
		System.out.println("Enter Employee basic salary:");
		basicsalary=sc.nextInt();
		
		System.out.println("Enter Employee present days:");
		presentdays=sc.nextInt();
		
		totalsalary=basicsalary*presentdays;
		
		System.out.println("Employee is:"+eid+"\nEmployee name:"+ename+
				"\nEmployee total salary :"+totalsalary);
		if(totalsalary>=90000)
		{
			System.out.println("CEO");
		}
		//else if(total salary>=75000 && total salary<90000)
		else if(totalsalary>=75000)
		{
			System.out.println("Sr.Developer");
		}
		else if(totalsalary>=60000)
		{
			System.out.println("Jr.Developer");
		}
		else if(totalsalary>=35000)
		{
			System.out.println("Fresher Employee");
		}
		else if(totalsalary>=20000)
		{
			System.out.println("clerk");
		}
		
		else
		{
			System.out.println("peon");
		}
		
	}

}
