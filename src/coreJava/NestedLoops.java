package coreJava;

public class NestedLoops {

	public static void main(String[] args) {

		// nested loops works 
		
		/*
		 * for(int i=1;i<=4;i++) // (outer for loop) this block will loop for 4 times {
		 * System.out.println("outer loop started"); for(int j=1;j<=4;j++) // inner loop
		 * { System.out.println("inner loop"); }
		 * System.out.println("outer loop finished"); }
		 */
		
		
		
		/* to print in this way 1  2  3  4
		                        5  6  7
		                        8  9 
                                10 */		                        
		                        
		int k=1;
		
		for(int i=0;i<=4;i++)    // (outer for loop) this block will loop for 4 times
		{
		//	System.out.println("outer loop started");
			for(int j=1;j<=4-i;j++)  // inner loop
			{
				System.out.print( k);
				System.out.print("\t");    // \t is for giving space between the numbers
				k++;
			}
			System.out.println("");	
		}
		
		
	}

}
