package day4;

public class StringPresenceinArray {

	public static void main(String[] args) {

		String a[]= {"abc","xyz","pqr","dfg"};
		
		String value="pqr";
		
		boolean flag=false;
		
		for(String i:a)
		{
			if(i.equals(value))
			{
				System.out.println("Element found");
				flag=true;
				break;

			}
		}
		if(flag==false)
		{
		System.out.println("Element not found");
		}
		
		
	}

}
