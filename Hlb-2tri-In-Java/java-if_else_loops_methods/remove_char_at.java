/**
 * Write a function that creates a copy of the string,
 * removing the character at the position n
 * (not the Python way, the “C array index”).
 * Prototype: def remove_char_at(str, n):
 * You are not allowed to import
 */
public class remove_char_at {
    public static String Remove_char_at(String str, int n) {
        String copy = ""; // ? Create a copy of the string
        for (int i = 0; i < str.length(); i++) {
            if (i != n)
                copy += str.charAt(i);
        } // end for
        return copy;
    } // end Remove_char_at

    public static void main(String[] args) {
        System.out.println(Remove_char_at("Best School", 3));
        System.out.println(Remove_char_at("chicago", 2));
        System.out.println(Remove_char_at("C is fun!", 0));
        System.out.println(Remove_char_at("School", 10));
        System.out.println(Remove_char_at("Python", -2));
    }
}
// end class remove_char_at
