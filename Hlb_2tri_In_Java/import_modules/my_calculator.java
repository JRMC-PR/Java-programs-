
/**
 * aply the instructions to java
 * Write a program that imports all functions from the file calculator_1.py and
 * handles basic operations.
 *
 * Usage: ./100-my_calculator.py a operator b
 * If the number of arguments is not 3, your program has to:
 * print Usage: ./100-my_calculator.py <a> <operator> <b> followed with a new
 * line
 * exit with the value 1
 * operator can be:
 * + for addition
 * - for subtraction
 * for multiplication
 * / for division
 * If the operator is not one of the above:
 * print Unknown operator. Available operators: +, -, * and / followed with a
 * new line
 * exit with the value 1
 * You can cast a and b into integers by using int() (you can assume that all
 * arguments will be castable into integers)
 * The result should be printed like this: <a> <operator> <b> = <result>,
 * followed by a new line
 * You are not allowed to use * for importing or __import__
 * Your code should not be executed when imported
 */
import imports.calculator_1;

public class my_calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: ./100-my_calculator.py <a> <operator> <b>");
            System.exit(1);
        } // end if
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        char operator = args[1].charAt(0);
        switch (operator) {
            case '+':
                System.out.println(a + " + " + b + " = " + calculator_1.add(a, b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + calculator_1.sub(a, b));
            case '*':
                System.out.println(a + " * " + b + " = " + calculator_1.mul(a, b));
            case '/':
                System.out.println(a + " / " + b + " = " + calculator_1.div(a, b));
            default:
                System.out.println("Unknown operator. Available operators: +, -, * and /");
                System.exit(1);
        } // end switch
    } // end main
} // end class
