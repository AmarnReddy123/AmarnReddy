package day1;

public class Operations {

	public static void main(String[] args) {
    
		int a=10;
		int b=20;
		
		//Arithmetic Operators--> + - % / *
		
		System.out.println("Arithmetic Operators");
		System.out.println("sum of a and b is:"+(a+b));
		System.out.println("diff of a and b is:"+(b-a));
		System.out.println("mul of a and b is:"+(a*b));
		System.out.println("div of a and b is:"+(a/b));
		System.out.println("mod div of a and b is:"+(a%b));
		
		//Relational Operators
		//Always return boolean value
		
		System.out.println("Regional Operators");
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical Operators
		//works between two boolean values
		
		boolean x = true;
		boolean y = false;
		
		System.out.println("Logical Operators");
		System.out.println(x && y);
		System.out.println(x || y);
		System.out.println(!x);
		System.out.println(!y);
		
		//increment/decrement Operators  ++ --
		
		a=10;
		a++;       //a=a+1
		System.out.println(a);
		
		b=20;
		b=b--;
		System.out.println(b);
			
	}

}
