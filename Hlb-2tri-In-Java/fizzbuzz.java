public class fizzbuzz {
    public static void Fizzbuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.print("Fizzbuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        } // end for
    } // end Fizzbuzz method
    /*
     *
     */

    public static void main(String[] args) {
        Fizzbuzz();
        System.out.print("\n");
    } // end main method
}// end class
