package com.edubridge;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Java is purely OOPS Language";
		
		System.out.println(s.length());
		char [] arr=new char[5];
		s.getChars(0, 5, arr, 0);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}