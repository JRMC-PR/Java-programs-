/*
&Write a program that prints the ASCII alphabet,
&in lowercase, not followed by a new line.
&Use only one print function with string format
&Use only one loop in your code
&You are not allowed to store characters in a variable
&You are not allowed to import any module
*/
public class print_alphabet {
    public static void main(String[] args) {
        char c;
        for (c = 'a'; c <= 'z'; c++)
            System.out.print(c);
    } // end main
} // end class print_alphabet
