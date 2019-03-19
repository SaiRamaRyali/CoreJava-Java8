package com.phone;

class Abc
{
	static Abc obj = new Abc();//call static method of instance
	private Abc()
	{
		
	}
	public static Abc getInstance()
	{
		return obj;
	}
}
public class Singleton {

	public static void main(String[] args) {

		
//		Abc obj1 = new Abc();
//		Abc obj2 = new Abc();
		
		Abc obj1 = Abc.getInstance();
		
		Abc obj2 = Abc.getInstance();
		
		
		//2 instances are created for the class
		//but you want your class has to be created only o
		//one instance, no 2
		//here comes singleton
		
	}

}
