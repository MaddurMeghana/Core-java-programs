package com.edubridge;
//one constructor u can copy with another constructor
class Fruit
{
	 String fname;
	 int fprice;
	
	Fruit(String fname,int fprice){
		this.fname=fname;
	    this.fprice=fprice; //this keyword is used to refer current instance either,child,constructor
		
	}
	Fruit(Fruit fruit)    //copy constructor
	{
		System.out.println("Copying constructor");
		this.fname=fruit.fname;
		this.fprice=fruit.fprice;
		
	}
	
	String name()
	{
		return fname;
	}
	int prise()
	{
		return fprice;
	}
	
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit f1=new Fruit("Mango",600);
		System.out.println("Name of the First fruit constructor:"+f1.name());
		System.out.println("Name of the First prise Constructor:"+f1.prise());
		Fruit f2=new Fruit(f1);//copying object
		System.out.println("Name of the second fruit constructor:"+f2.name());
		System.out.println("Name of the second prise constructor:"+f2.prise());
		
		
		
				
	}

}