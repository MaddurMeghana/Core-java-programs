package com.edubridge;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="Java is purely OOPS Language";
		
		System.out.println(s1);
		
		//where whitespace is their from that your string will divide
		String a[]=s1.split("\\s");
		
		for(String i:a) {
			System.out.println(i);
		}
		
		
		
	}

}