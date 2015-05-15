/* THIS CODE IS MY OWN WORK, IT WAS WRITTEN WITHOUT CONSULTING A 
 * TUTOR OR CODE WRITTEN BY OTHER STUDENTS. Milap Naik */

//This program recursively solves exponent problems. The power method does the actual solving
//while testPower is for testing purposes.
public class Power
{
   public static int power(int a, int n )
   {
      int sol1, mySol;

      if ( n == 0 /* the base cases */ )
      {
         return 1; // The readily available solution for the base case     
      }
      else
      {
         // factorial(n) is solved using solutions of 
    	 // the smaller problem factorial(n-1)...
  
    	  sol1 = power ( a, n-1 );  // Solve a smaller problem

    	  mySol = a * sol1;       // Use the solution of the smaller problem
                          // to solve the original problem

    	  return mySol;
      }
   }


   



   public static void testPower(int a, int n, int G)
   {
      System.out.print("Calling power(" + a + "," + n + ") ... ");

      int result = power(a, n);

      if (result == G)
      {
         System.out.println( a+"^"+n + " = " + result + ", good.");
      }
      else
      {
         System.out.println( a+"^"+n+" = " + result + ", not " +G+ ", ERROR!");
      }
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

