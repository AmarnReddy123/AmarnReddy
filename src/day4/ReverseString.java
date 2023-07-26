package day4;

public class ReverseString {

	public static void main(String[] args) {

		String s="selenium";
		
		int len=s.length();
		
		String rev="";
		
		for(int i=len-1;i>=0;i--)  //7,6,5
		{
			rev=rev+s.charAt(i);   //muineles
		}
		
		System.out.println(rev);
		
	}

}
