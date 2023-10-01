/*
&Create a new Java class called PrintLastDigit.
&Define a public static method called printLastDigit that takes an int parameter and returns an int.
&Inside the printLastDigit method, use the modulo operator (%) to get the remainder when the input
&number is divided by 10. This will give you the last digit of the number.
&Print the last digit to the console using the System.out.println method.
&Return the last digit from the printLastDigit method.
&In the main method, call the printLastDigit method with a test number to verify that it works correctly.
*/
public class print_last_digit {
    /*
     * Define a public static method called printLastDigit that takes an int
     * parameter and returns an int.
     */
    public static int print_lats_digit(int number) {
        number = Math.abs(number) % 10;
        System.out.print(number);
        return number;
    } // end print_last_digit

    public static void main(String[] args) {
        print_lats_digit(98);
        print_lats_digit(0);
        int r = print_lats_digit(-1024);
        System.out.println(r);
    } // end main
}
