/*
&Define a function named isLower that takes a character as an argument.
&Inside the function, use the ord() function to get the Unicode code point of the character.
&Check if the Unicode code point is within the range of lowercase letters in the Unicode table. i
&In Unicode, lowercase letters typically have code points ranging from 97 ('a') to 122 ('z').
&If the code point falls within this range, return true to indicate that the character is lowercase.
&If the code point is outside the lowercase range, return false to indicate that the character is not lowercase.
 */
public class islower {
    /*
     * ! @param c a character
     * ! @return true if c is a lowercase letter, false otherwise
     */
    public static boolean Islower(String c) {
        for (int i = 0; i < c.length(); i++) {
            char letter = c.charAt(i);
            if (letter < 'a' || letter > 'z')
                return false;
        }
        return true;
    } // end Islower

    /*
     * TODOTest the Islower method
     */
    public static void main(String[] args) {
        System.out.println("a is " + (Islower("a") ? "lower" : "upper"));
        System.out.println("H is " + (Islower("H") ? "lower" : "upper"));
        System.out.println("A is " + (Islower("A") ? "lower" : "upper"));
        System.out.println("3 is " + (Islower("3") ? "lower" : "upper"));
        System.out.println("g is " + (Islower("g") ? "lower" : "upper"));
    } // end main

} // end class islower
