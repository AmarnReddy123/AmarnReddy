package collections;

import java.util.ArrayList;

public class arrayListexample {

	// can accept duplicate values
	// arraylist,linkedlist,vector - implementing list interface
	// array have fixed size where as arraylist can grow dynamically
	// you can access and insert any value in any index
	
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();
		a.add("amarnath");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add(0, "student");
		System.out.println(a);
	//	a.remove(1);
	//	a.remove("java");
	//	System.out.println(a);
		a.get(2);
		System.out.println(a.get(2));
		// testing
		System.out.println(a.contains("java"));
		System.out.println(a.indexOf("amarnath"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
	
	}

}
