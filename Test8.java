package com.day3;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter name:");
		String name=sc.nextLine();
		System.out.println("Enter the age:");
		
		int age=sc.nextInt();
		
		if(age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible for voting");
		}
	}

}