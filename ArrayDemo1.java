import java.util.Scanner;

/**
 * This program shows values being read into an array's
 * elements and then displayed.
 */

public class ArrayDemo1
{
   public static void main(String[] args)
   {
      final int NUM_EMPLOYEES = 3;  // Number of employees
      
      
      
      // Create an array to hold employee hours.
      int[] hours = new int[NUM_EMPLOYEES];
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the hours worked by " +
                         NUM_EMPLOYEES + " employees.");
      for(int i = 0 ; i < NUM_EMPLOYEES ; i++)
      {
        System.out.format("Employee %d:",i+1);
        hours[i] = keyboard.nextInt();
      }
     for ( int val : hours )
     {
       System.out.println(val);
     }

     
   }
}