package com.edubridge;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Good";//immutable
		
		 str=str+"Afternoon";
		System.out.println(str);
		
		StringBuffer str1=new StringBuffer("Good");//mutable
		str1.append("Evening");
		str1.append("Hi");
		System.out.println(str1);
	
		
		String s1="Java";
		
		System.out.println(s1.replace('a', 'b'));
		
		System.out.println(s1.replace("Java", "JavaScript"));
		
		
	
	}

}