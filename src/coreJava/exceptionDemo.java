package coreJava;

public class exceptionDemo {
	
	int a=4;
	// 3 lines
	// try catch mechanism
	
	
	   
	   
	public static void main(String[] args) {

		
		int b=7;
		int c=0;
		   try
		   {
		
			   int k=b/c;
			   
			   System.out.println(k);
			   

			//   int arr[]=new int[7];
			//   System.out.println(arr[7]);
			   
	       }
		   
		   
		   catch(ArithmeticException et)
		   {
			   System.out.println("I catched the Arithmetic/exception");   
		   }
		   
		   
		   catch(IndexOutOfBoundsException ets)
		   {
			   System.out.println("I catched the IndexBound/exception");   
		   }
		   
		   catch(Exception e)
		   {
			   System.out.println("I catched the error/exception");   
		   }
		
		   finally
		   {
			   System.out.println("delete cookies");   // this block is executed irrespective of exception thrown or not
		   }
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
	}

}
