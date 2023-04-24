//Multiple inheritance
package com.oops;

class Addition
{
int i=10,j=5;

	public void add()
	{
		System.out.println("The addition is:"+(i+j));
	}
}
class Substraction  extends Addition
{
	public void sub()
	{
		System.out.println("The substraction is:"+(i-j));
		
	}
}
class Multiplication extends Substraction
{
	public void mul()
{
	System.out.println("The multiplication is:"+(i*j));
	
}
}
class Division extends Multiplication
	{
		public void div()
	{
		System.out.println("The division is:"+(i/j));
		
	}
	
}

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Division d1=new Division();
		d1.add();
		d1.sub();
		d1.mul();
		d1.div();
		
	}

}