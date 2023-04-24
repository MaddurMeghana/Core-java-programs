package com.oops;

//single Inheritance+Hirarchicak Inheritance=Hybrid
class GrandFather
{
	public void showG()
	{
		System.out.println("This is Grandfather class");
	}
}
class Father extends  GrandFather
{
	public void showF()
	{
		System.out.println("This is Father class");
	}
}
class Son extends Father
{
	public void showsS()
	{
		System.out.println("This is son  class which is inherited from father class");
	}
}
class Daughter extends Father
{
	public void showsD()
	{
		System.out.println("This is Daughter  class which is inherited from father class");
	}
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s1=new Son();
		s1.showG();
		s1.showF();
		//s1.showF();
		s1.showsS();
		Daughter d1=new Daughter();
		d1.showsD();
	}

}