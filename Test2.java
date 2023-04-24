package com.oops;

class Emp
{
	int eid;
	String ename;
	String eaddress;
	
	public void display(int eid,String ename,String eaddress)
	{
		System.out.println(eid+" "+ename+" "+eaddress);
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1=new Emp();
		
		e1.display(101, "sam", "pune");
		e1.display(102, "jhon", "Mumbai");
		e1.display(103, "Ayan", "Banglore");
	}

}