package coreJava;

public class childDemoSuper extends parentDemoSuper{

	String name = "qaclickacademy";
	
	public void getStringdata()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public childDemoSuper()
	{
		super();  // this should be always be at first line
		System.out.println("child class constructor");
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am child class");
	}
	
	public static void main(String[] args) {

		childDemoSuper cd = new childDemoSuper();
		
		cd.getStringdata();
		cd.getData();
	}

}
