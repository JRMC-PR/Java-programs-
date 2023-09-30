/*Create a new Java class called Power.
Define a public static method called pow that takes two int parameters (a and b) and returns an int.
Inside the pow method, use a for loop to multiply a by itself b times.
Return the result of the multiplication.
In the main method, call the pow method with test values for a and b to verify that it works correctly.
 */
public class pow {
    /*
     * Define a public static method called pow that takes two int parameters
     * and returns an int.
     */
    public static double Pow(int a, int b) {
        double result = 1;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        } // end if
        else if (b < 0) {
            result = 1 / b;
            return result;
        }
        return result;
    } // end Pow method
    /*
     * main method
     */

    public static void main(String[] args) {
        System.out.println(Pow(2, 2));
        System.out.println(Pow(98, 2));
        System.out.println(Pow(98, 0));
        System.out.println(Pow(100, -2));
        System.out.println(Pow(-4, 5));
    } // end main method
} // end class
