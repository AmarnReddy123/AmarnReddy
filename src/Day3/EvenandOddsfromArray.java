package Day3;

public class EvenandOddsfromArray {

	public static void main(String[] args) {
       
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		//print Even numbers from Array
		
		System.out.println("List of Even number");
		
		for(int num:a)
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
		}
		
		System.out.println("List of odd number");
		
		for(int num:a)
		{
			if(num%2!=0)
			{
				System.out.println(num);
			}
		}
		
	}

}
