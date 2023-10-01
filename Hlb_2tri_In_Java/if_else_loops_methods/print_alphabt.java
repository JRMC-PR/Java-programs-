/*
&Write a program that prints the ASCII alphabet,
&in lowercase, not followed by a new line.
&Print all the letters except q and e
&You can only use one print function with string format
&You can only use one loop in your code
&You are not allowed to store characters in a variable
&You are not allowed to import any module
*/
public class print_alphabt {
    public static void main(String[] args) {
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            if (c != 'q' && c != 'e')
                System.out.print(c);
        } // end for
    } // end main
} // end class print_alphabt
