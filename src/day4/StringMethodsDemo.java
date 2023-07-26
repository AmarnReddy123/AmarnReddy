package day4;

public class StringMethodsDemo {

	public static void main(String[] args) {

		String s="welcome";
		
		// 1.length()
		
		System.out.println(s.length());
		
		// we can write like int l=s.length and in System.out.println  we will write (int l)
		
		// 2.concat
		
		String s1="welcome";
		String s2="to java";
		
		System.out.println(s1+s2);
		System.out.println(s1+"  "+s2);
		
		System.out.println(s1.concat(s2));
		
		System.out.println("welcome"+"to java");
		
		System.out.println("welcome".concat("to java"));
		
		// 3.trim()
     
		s="         java programming      ";
		//System.out.println(s.length());
		System.out.println(s);
		
		System.out.println(s.trim());
		
		// 4.charAt() - index will start from 0
		
		s="welcome";
		
		System.out.println(s.charAt(5));  //m
		System.out.println(s.charAt(0));  //w
		
		// 5.contains()----> returns true/false
		
		s="Welcome";
		
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Come"));
		
		// 6.equals()  ----> returns true/false
		
		System.out.println(s.equals("Welcome"));  //true
		System.out.println(s.equals("welcome"));  //false
		
		// 7.equalsignoreCase() ---->returns true/false
		
		System.out.println(s.equalsIgnoreCase("welcome"));  //true
		
		// 8.replace()
		
		s="welcome to java welcome to selenium";
		
		System.out.println(s.replace('o', 'z'));
		
		System.out.println(s.replace("welcome", "xyz"));
		
		// substring
		
		s="welcome";
		
		System.out.println(s.substring(0,3));  //wel
		System.out.println(s.substring(4,7));  //ome
		
		//toLoerCase()  &  toUpperCase()
		
		s="WELCOME";
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s.toUpperCase());

		
		
	}

}
