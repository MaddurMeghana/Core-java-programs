package com.Edubridge;

class Product{
		String pname="Speaker";	
		static int prise=15000;
	}
	public class Test2 {

		public static void main(String[] args) {
			Product p1=new Product();
			System.out.println(p1.pname);
			System.out.println(Product.prise);
	}

}
