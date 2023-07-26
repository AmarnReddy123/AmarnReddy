package coreJava;

public class StaticVariables {

	String name;   // instance variables
	String address;
	static String city;  // class variables
	static int i;
	static {
		city ="Bangalore";
		i=0;
	}
	
	StaticVariables(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress()
	{
	    System.out.println(address+" "+city);	
	}
	public static void getCity()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {

		StaticVariables obj = new StaticVariables("Bob","Marthahalli");
		StaticVariables obj1 = new StaticVariables("Ram","Jayanagar");
		StaticVariables obj2 = new StaticVariables("Ram","Jayanagar");
		obj.getAddress();
		obj1.getAddress();
		StaticVariables.getCity();
		StaticVariables.i=4;
		obj.address="XYZ";
		
	}

}
