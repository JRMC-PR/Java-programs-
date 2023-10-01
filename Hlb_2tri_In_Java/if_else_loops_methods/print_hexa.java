/*
&Write a program that prints all numbers from 0 to 98 in decimal
&and in hexadecimal (as in the following example)
&You can only use one print function
&You can only use one loop in your code
&You are not allowed to store numbers or strings in a variable
&You are not allowed to import*/
public class print_hexa {
    public static void main(String[] args) {
        for (int num = 0; num < 99; num++)
            System.out.printf("%d = 0X%X%n\n", num, num);
    } // end main
} // end class
