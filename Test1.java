package com.edubridge;

//overloading(compile time polymorphism)
//-function name same parameter are different
class Calculations
{
	public void add(int a, int b)
	{
		System.out.println("Addition is:"+(a+b));
	}

	public void add(int a, int b,int c)
	{
		System.out.println("Addition is:"+(a+b+c));
	}
	public void add(String  a, String  b)
	{
		System.out.println("Addition is:"+(a+b));
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculations c1=new Calculations();
		c1.add(10, 20);
		c1.add("Hello", "World");
		c1.add(10, 20,30);
	}

}