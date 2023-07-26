package coreJava;

public class constructDemo {
	
	public constructDemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor lecture 1");
	}
	// parameterised constructor 
	
	public constructDemo(int a, int b)
	{
		System.out.println("I am in the parameterised constructor ");
		int c = a+b;
		System.out.println(c);
	}
	
	public constructDemo(String str)
	{
		System.out.println(str);
	}
	
	
	public void getData()
	{
		System.out.println("I am the method");
	}

	public static void main(String[] args) {

		constructDemo cd = new constructDemo("hello");
		
		//constructDemo c = new constructDemo(4,5);
	
	
	}

}
