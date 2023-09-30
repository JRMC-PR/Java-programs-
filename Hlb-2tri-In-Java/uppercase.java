
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
