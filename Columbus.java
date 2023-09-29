import java.util.Scanner;

public class Columbus {
 static final int COLUMBUS_SAILED_YEAR = 1492;
 public static void main(String[] args) {

  // Scanner to read from standard input
  Scanner in = new Scanner(System.in);
  // User integer input: Year that Columbus sailed according to the user
  int year = 0;
  // Counter to keep track of the number of attempts
  int tries = 0;

  // Loop until user enters the correct year
  while (year != COLUMBUS_SAILED_YEAR) {

   // Increment tries
   tries++;

   // Prompt user for the year
   System.out.print("In what year did Columbus sailed to America? ");
   year = in.nextInt();

   // Validate against corret year and print a message
   if (year == COLUMBUS_SAILED_YEAR) {
    System.out.format("Yes, Columbus sailed in %d. It took you %d tries to guess correctly.%n", year, tries);
   } else {
    System.out.format("No, Columbus first trip was not in %d, try again!%n", year);
   }

  } // End while
 } // End main
} // End Columbus
