package day4;

public class StrinSwapingwithoutThirdvariable {

	public static void main(String[] args) {

		String a="Hello";
		String b="world";
		
        System.out.println("Before swaping");
		
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		
		a=a+b;  //Helloworld
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
        System.out.println("After swaping");
		
		System.out.println("the value of a is:"+a);
		System.out.println("the value of b is:"+b);
		
	
	}

}
