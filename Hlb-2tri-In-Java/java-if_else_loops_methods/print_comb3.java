/*
&Write a program that prints all possible different combinations of two digits.
&Numbers must be separated by ,, followed by a space
&The two digits must be different
&01 and 10 are considered the same combination of the two digits 0 and 1
&Print only the smallest combination of two digits
&Numbers should be printed in ascending order, with two digits
&The last number should be followed by a new line
&You can only use no more than 3 print functions with string format
&You can only use no more than 2 loops in your code
&You are not allowed to store numbers or strings in a variable
&You are not allowed to import any module
*/
public class print_comb3 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i < j) {
                    System.out.printf("%d%d%s", i, j, (i == 8 && j == 9) ? "\n" : ", ");
                } // end if
            } // end inner for
        } // end outer for
    } // end main
} // end class print-comb3
