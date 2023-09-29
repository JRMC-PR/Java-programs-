/* */
public class islower {

    public static boolean Islower(String c) {
        for (int i = 0; i < c.length(); i++) {
            char letter = c.charAt(i);
            if (letter < 'a' || letter > 'z')
                return false;
        }
        return true;
    } // end Islower

    public static void main(String[] args) {
        System.out.println("a is " + (Islower("a") ? "lower" : "upper"));
        System.out.println("H is " + (Islower("H") ? "lower" : "upper"));
        System.out.println("A is " + (Islower("A") ? "lower" : "upper"));
        System.out.println("3 is " + (Islower("3") ? "lower" : "upper"));
        System.out.println("g is " + (Islower("g") ? "lower" : "upper"));
    } // end main

} // end class islower
