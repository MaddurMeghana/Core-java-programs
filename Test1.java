package com.oops;

class Employee
{
	//data members
	
	int eid=101;
	String ename="Jhon";
	String eaddress="Mumbai";
	int eid1=102;
	String ename1="sam";
	String eaddress2="Pune";
	
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1=new Employee();
		System.out.println(e1.eid+" "+e1.ename+" "+e1.eaddress);
		System.out.println(e1.eid1+" "+e1.ename1+" "+e1.eaddress2);
	}

}