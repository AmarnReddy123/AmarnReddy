package coreJava;

// function overloading
// either argument count should be different or
//  data  should be different

public class childlevel1 extends ChildClassDemo{

	
	public void getData(int a)
	{
		System.out.println(a);
	}
	
	public void getData(String a)
	{
		System.out.println(a);
	}
	
	public void getData(int a, int b)
	{
		System.out.println(b);
	}
	
	
	
	public static void main(String[] args) {

		childlevel1 cl= new childlevel1();
		cl.getData(2);
		cl.getData("hello");
		cl.getData(3, 5);
		
	}

}
