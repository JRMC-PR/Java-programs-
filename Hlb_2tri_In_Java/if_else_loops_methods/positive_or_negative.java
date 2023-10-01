
/*
 &This program will assign a random signed number to the variable number each time it is executed.
&The variable number will store a different value every time you will run this program
&The output of the program should be:
&The number, followed by
&if the number is greater than 0: is positive
&if the number is 0: is zero
&if the number is less than 0: is negative
&followed by a new line
 */

public class positive_or_negative {

    public static void main(String[] args) {
        // & generate a random number
        int number = (int) (Math.random() * 100 + 1); // & generate a random number
        // verify and print
        if (number > 0)
            System.out.println(number + " is positive");
        else if (number == 0)
            System.out.println(number + " is zero");
        else
            System.out.println(number + " is negative");
    } // end main
} // end class positive_or_negative
