public class fizzbuzz {
    /**
     * Prints the numbers from 1 to 100, replacing multiples of 3 with "Fizz",
     * multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
     */
    public static void Fizzbuzz() {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) { // if i is divisible by both 3 and 5
                System.out.print("Fizzbuzz ");
            } else if (i % 3 == 0) { // if i is divisible by 3
                System.out.print("Fizz ");
            } else if (i % 5 == 0) { // if i is divisible by 5
                System.out.print("Buzz ");
            } else { // if i is not divisible by 3 or 5
                System.out.print(i + " ");
            }
        } // end for
    } // end Fizzbuzz method

    /**
     * main Method
     */
    public static void main(String[] args) {
        Fizzbuzz();
        System.out.print("\n");
    } // end main method
}// end class
