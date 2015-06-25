/* THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A 
 * TUTOR OR CODE WRITTEN BY OTHER STUDENTS. Milap Naik */

/* This program recursively solves exponent problems. The power method does the actual solving
   while testPower is for testing purposes. */

public class Power
{
	public static int power(int a, int n )
	{
		int smallSol, finalSol;

		if ( n == 0 )  /* the base cases */ 
			return 1;  /* The readily available solution for the base case */          
		else
		{
			/* factorial(n) is solved using solutions of the smaller problem factorial(n-1)... */
  
			/* Solve a smaller problem */
			smallSol = power ( a, n-1 );  

			/* Use the solution of the smaller problem to solve the original problem */
			finalSol = a * smallSol;         

			return finalSol;
		}
	}

	public static void testPower(int integer, int power, int Solution)
	{
		System.out.print("Calling power(" + integer + "," + power + ") ... ");

		int result = power(integer, power);

		if (result == Solution)     
			System.out.println( integer+"^"+ power + " = " + result + ", good.");      
		else    
			System.out.println( integer+"^"+ power +" = " + result + ", not " + Solution + ", ERROR!");    
	}

	public static void main(String args[])
	{
		testPower(2, 0, 1 );
		testPower(5, 0, 1 );
		testPower(4, 1, 4 );
		testPower(4, 2, 16 );
		testPower(2, 3, 8 );
      	testPower(7, 5, 16807);
      	testPower(7, 9, 40353607);

      	System.out.println();
	}
}

