package com.day3;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		
//no is divisible by ==0 even no
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter no:");
		int x=s1.nextInt();
		
		if(x%2==0) //if true then execute
		{
			System.out.println("Given no is even");
		}
		else
		{
			System.out.println("Given no is odd");
			
		}
	}

}