/**
 * Write a program that prints the number of and the list of its
 * arguments.
 * The output should be:
 * Number of argument(s) followed by argument (if number is one)
 * or arguments (otherwise), followed by
 * : (or . if no arguments were passed) followed by
 * a new line, followed by (if at least one argument),
 * one line per argument:
 * the position of the argument (starting at 1) followed by :, followed by the
 * argument value and a new line
 * Your code should not be executed when imported
 * The number of elements of argv can be retrieved by using: len(argv)
 * You do not have to fully understand lists yet, but imagine that argv can be
 * used just like a C array:
 * you can use an index to walk through it. There are other ways (which will be
 * preferred for future project tasks), if you know them you can use them.
 */
public class args {
    public static void main(String[] args) {
        int arg_count = args.length; // get the number of arguments
        if (arg_count < 1)
            System.out.println(arg_count + " arguments."); // print the number of arguments
        else {
            if (arg_count == 1)
                System.out.println(arg_count + " argument:"); // print the number of arguments
            else
                System.out.println(arg_count + " arguments:"); // print the number of arguments
        }
        for (int i = 1; i <= arg_count; i++) {
            System.out.println(i + ": " + args[i - 1]); // print the arguments
        } // end for loop
    } // end main
} // end class
