package com.day3;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter no:");
		int x=s1.nextInt();
		System.out.println("Enter no:");
		int y=s1.nextInt();
		System.out.println("Enter no:");
		int z=s1.nextInt();
		
		if((x>y)&&(x>z))
		{
			System.out.println("x is larger number");
		}
		
		if((y>x)&&(y>z))
		{
			System.out.println("y is larger number");
		}
		
		if((z>x)&&(z>y))
		{
			System.out.println("z is larger number");
		}
		
	}

}