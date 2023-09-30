/**
 * Write a program that prints the ASCII alphabet, in reverse order,
 * alternating lowercase and uppercase (z in lowercase and Y in uppercase),
 * not followed by a new line.
 * You can only use one print function with string format
 * ou can only use one loop in your code
 * You are not allowed to store characters in a variable
 * You are not allowed to import
 *
 */
public class print_tebahpla {
    public static void main(String[] args) {
        for (int i = 122; i >= 97; i--) { // 122 is z, 97 is a
            if (i % 2 == 0) { // if even
                System.out.print((char) i);
            } else {
                System.out.print((char) (i - 32));
            } // end ifelse
        } // end for
    } // end main
} // end class print_tebahpla
