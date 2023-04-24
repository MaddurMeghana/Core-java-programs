package com.oops;
class Animal
{
	//Hierarchical inheritance
	String animalname="Dog";
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	public void dance()
	{
		System.out.println(animalname +"is dancing in the rain");
	}
}

class Puppies extends Animal
{
	public void bark()
	{
		System.out.println(animalname +"is barking ");
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d1=new Dog();
		
		d1.dance();
		Puppies p1=new Puppies();
		p1.bark();
		
		p1.eat();
	}

}