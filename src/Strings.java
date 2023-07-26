
public class Strings {

	public static void main(String[] args) {

		//String is an object   //string literal
	
	//	String s1 = "Amar nath reddy";
		String s5 = "hello";
		//new
		String s2 = new String("welcome");
		String s3 = new String("welcome");
		
		String s = "Amar nath reddy";
		String[] splittedString = s.split("nath");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.println(s.charAt(i));
		}
		
		
	}

}
