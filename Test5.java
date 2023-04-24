package com.edubridge;

public class Test5 {

	public static void main(String[] args) {
		//mutable sequence of characters
		StringBuilder s1=new StringBuilder("Jhon");
		
		System.out.println(s1);
		
		s1.append("Sam");
		//using append at time u can add only single value
		
		System.out.println(s1);
		
		//using insert method we can add string on perticular index no
		s1.insert(0,"kajal");
		System.out.println(s1);
		
		s1.replace(1, 2, "Ajay");
		
		System.out.println(s1);
		
		s1.delete(1,5);

		System.out.println(s1);
		StringBuilder s2=new StringBuilder("Princi");

		System.out.println(s2);
		
		s2.reverse();
	
		System.out.println(s2);
		
		
	}

}