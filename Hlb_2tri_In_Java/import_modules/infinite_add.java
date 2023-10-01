/**
 * Write a program that prints the result of the addition of all arguments
 * The output should be the result of the addition of all arguments, followed by
 * a new line
 * You can cast arguments into integers by using int() (you can assume that all
 * arguments can be casted into integers)
 * Your code should not be executed when imported
 */
public class infinite_add {
    public static void main(String[] args) {
        int arg_count = args.length; // get the number of arguments
        if (arg_count < 1)
            System.out.println("0");
        else {
            int res = 0; // initialize the result
            for (int i = 0; i < arg_count; i++) {
                res += Integer.parseInt(args[i]);
            } // end forloop
            System.out.println(res);
        } // end else
    } // end main
} // ens class
