
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
