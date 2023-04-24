package com.oops;
 //single inheritance
class Product{
	int pid=101;
	String pname="chair";
	public void disp() {
		System.out.println(pid+ " "+pname);
	}
}
class Orders extends Product{
	int oid=1001;
	String orderdate="17March2023";
	String receivedate="18March2023";
	public void show()
	{
		System.out.println(oid+ " "+orderdate+" "+receivedate);
	}
}
public class Test4 {
public static void main(String args[]) {
	Orders o1=new Orders();
	o1.disp();
	o1.show();
}
}