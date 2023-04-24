package com.Edubridge;


import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter number:");
		
		int n=s1.nextInt();
		
		int i=1;
		do
		{
			
			System.out.println(n+"X"+i+"="+(n*i));
			i++;
		}while(i<=10);
		
	}

}
