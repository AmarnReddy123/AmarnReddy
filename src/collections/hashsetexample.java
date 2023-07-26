package collections;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetexample {

	public static void main(String[] args) {

		
		// hashset , treeset implements set interfaces
		// does not accept duplicate values
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("he");
		hs.add("she");
		
		hs.add("INDIA");
		System.out.println(hs);
	//	System.out.println(hs.remove("UK"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		Iterator<String> i = hs.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
