
/*Ejercicio4 
 * Author jesus R. Mendez Cruz @Vaiosos
 */
import java.text.DecimalFormat;
import java.util.*;

public class MatrizMN {
    public static void main(String[] args) {

        // variables, Scanner and Decimal formath object

        int rows, colums, r, c, selection, lineNumber;
        double numbers;// will store the value of the math.random to oass to the array
        String Format = "#.##";// will manage the number of decial points we want
        Scanner userInput = new Scanner(System.in);// will read the user input forn the keyborad
        DecimalFormat adjust = new DecimalFormat(Format);

        // Prompt the user for the rowns and colums
        System.out.print("Please enter the amount of [ROWS] you would like: ");
        rows = userInput.nextInt();// recive the user input for the rows
        System.out.print("Please enter the amount of [COLUMS] you would like: ");
        colums = userInput.nextInt();// recive the user input for the colums
        System.out.println("The Matrix is: ");

        // declare the two dimentional array

        double[][] Matrix = new double[rows][colums];// we pass the values enter by the user

        // Populate the array
        for (r = 0; r < Matrix.length; r++) {
            for (c = 0; c < Matrix[r].length; c++) {

                numbers = (double) (Math.random() * 100 + 1);
                Matrix[r][c] = numbers;
            } // end colums for
        } // end rowns for

        // Show the user the populated array
        for (r = 0; r < Matrix.length; r++) {
            System.out.print("|");
            for (c = 0; c < Matrix[r].length; c++) {
                System.out.print(adjust.format(Matrix[r][c]) + "|");
            }
            System.out.println();
        }

        // Promst the user for the row or colum he wishis to see
        System.out.print("Would you like to view a [ROW]/1 or a [COLUMS]/2: ");
        selection = userInput.nextInt();

        if (selection == 1) {// will manage the rows
            System.out.print("Enter the [ROW] you would like to see: ");
            selection = userInput.nextInt();
            System.out.println(" You selected [ROW]:" + selection);

            // verification of the selected row
            if (selection > rows) {
                System.out.println("Please enter a valid [ROW] option!");
                System.out.print("Enter the [ROW] you would like to see: ");
                selection = userInput.nextInt();
                while (selection > rows) {
                    System.out.print("Please enter a valid [ROW] option!");
                    selection = userInput.nextInt();
                } // end while

                // substract 1 front the selection to obtion the correct row number
                lineNumber = selection - 1;

                // Show selected row
                System.out.print("THE selected rown is:");
                for (c = 0; c < colums; c++) {

                    System.out.print("|" + Matrix[lineNumber][c]);

                }
                System.out.print("|");

            } else {
                // if nothing is wrong with the selection, just print
                lineNumber = selection - 1;
                for (c = 0; c < colums; c++) {

                    System.out.print("|" + adjust.format(Matrix[lineNumber][c]));

                } // end colums for
                System.out.print("|");

            } // end inner else
            System.out.println();

        } else {// will handel the colums
            System.out.print("Enter the [COLUMS] you would like to see: ");
            selection = userInput.nextInt();
            System.out.println(" You selected [COLUMS]:" + selection);

            // veryficaion of the selected colum
            if (selection > colums) {
                System.out.println("Please enter a valid [COLUM] option!");
                System.out.print("Enter the [COLUM] you would like to see: ");
                selection = userInput.nextInt();
                while (selection > colums) {
                    System.out.print("Please enter a valid [COLUM] option!");
                    selection = userInput.nextInt();
                } // end while

            } else {
                // if nothing is wrong with the selection, just print
                lineNumber = selection - 1;
                for (r = 0; r < rows; r++) {

                    System.out.print("|" + adjust.format(Matrix[r][lineNumber]));
                    System.out.println("|");

                } // end colums for

            } // end else

        } // end colums else

        System.out.println("Thank you! Have a nice day! ");

    }// end main
}// end class