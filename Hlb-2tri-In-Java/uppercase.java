/*
&Create a new Java class called Uppercase.
&Define a public static method called uppercase that takes a String parameter and returns void.
&Inside the uppercase method, use a for loop to iterate through all the characters in the input string.
&For each character, check if it is a lowercase letter by comparing its ASCII value to the ASCII values of 'a' and 'z'.
&If the character is a lowercase letter, convert it to uppercase by subtracting the ASCII value of 'a' and adding the ASCII value of 'A'.
&Print each character to the console using the System.out.print method.
&After the loop, print a newline character to the console using the System.out.println method.
&In the main method, call the uppercase method with a test string to verify that it works correctly.
*/
public class uppercase {
    /*
     * @param str a string
     * return the uppercase version of str
     */
    public static void Uppercase(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z')
                c = (char) (c - 'a' + 'A');
            System.out.print(c);
        } // end for
        System.out.println();
    }

    public static void main(String[] args) {
        Uppercase("best");
        Uppercase("best School 98 Battery street");

    } // end main
} // end upper case class
