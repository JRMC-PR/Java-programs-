/*
&This program will assign a random signed number to the variable number each time it is executed.
&Print the last digit of the number stored in the variable number.
&The variable number will store a different value every time you will run this program
&Y number = random(-10000, 10000)
&The output of the program should be:
&The string Last digit of, followed by
&       the number, followed by
&       the string is, followed by the last digit of number, followed by
&   if the last digit is greater than 5: the string and is greater than 5
&   if the last digit is 0: the string and is 0
&   if the last digit is less than 6 and not 0: the string and is less than 6 and not 0
&   followed by a new line
*/
public class last_digit {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int number = (int) (Math.random() * 20001 - 10000); // & generate a random number
        int last = Math.abs(number) % 10;
        // & chekc value
        if (number > 0 || last == 0)
            System.out.print("Last digit of " + number + " is " + last);
        else
            System.out.print("Last digit of " + number + " is -" + last);
        if (last > 5 && number > 0)
            System.out.println(" and is greater than 5");
        else if (last == 0)
            System.out.println("and is 0");
        else
            System.out.println(" and is less than 6 and not 0");
    } // end main
} // end class positive_or_negative
