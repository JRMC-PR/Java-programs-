/*
 Create a new Java class called Add.
Define a public static method called add that takes two int parameters (a and b) and returns an int.
Inside the add method, add a and b together using the + operator.
Return the result of the addition.
In the main method, call the add method with test values for a and b to verify that it works correctly.
*/
public class add {
    /*
     * Define a public static method called add that takes two int parameters and
     * returns an int.
     */
    public static int add(int a, int b) {
        return a + b;
    } // end add

    /*
     * main method
     */
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(98, 0));
        System.out.println(add(100, -2));
    } // end main

}
