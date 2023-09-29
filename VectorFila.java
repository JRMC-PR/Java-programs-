
/** ejercicio numero 3 *
 * Author Jesus R. Mendez Cruz @Vaiosos
*/
import java.util.Scanner;

public class VectorFila {
    public static void main(String[] args) {
        Scanner userImput = new Scanner(System.in);// This scanner will handel the user inputs

        // variables
        int rows, colums, r, c, finalColum;
        double numbers;

        System.out.println("Plese enter the sizes of the Rows and Colums");
        System.out.print("Rows ->");
        rows = userImput.nextInt();
        System.out.print("Colums ->");
        colums = userImput.nextInt();


        // create the array and pass the values of rows and colums

        double Matrix[][] = new double[rows][colums];

        finalColum = Matrix.length - 1;

        // populate array
        for (r = 0; r < Matrix.length; r++) {

            for (c = 0; c < Matrix[r].length; c++) {
                numbers = (double) (Math.random() * 100 + 1);
                Matrix[r][c] = numbers;

            }

        }
        System.out.println("The following matrix is: ");
        // show complete array
        for (r = 0; r < Matrix.length; r++) {

            System.out.println();
            for (c = 0; c < Matrix[r].length; c++) {
                System.out.printf("| " + "%.2f", Matrix[r][c]);

            }
            System.out.print("|");

        }
        System.out.println();
        System.out.println(" The result is: ");
        System.out.println();

        // show first row an first and last colums
        for (r = 0; r < Matrix.length; r++) {

            for (c = 0; c < Matrix[r].length; c++) {

                // the next siries of if else if will how only the first rown and first and last
                // colums
                if (r == 0) {
                    System.out.printf("| " + "%.2f", Matrix[r][c]);

                } else if (c == 0 || c == finalColum) {

                    System.out.printf("| " + "%.2f", Matrix[r][c]);
                    if (c == finalColum) {
                        System.out.print("|");
                    }

                } else {
                    System.out.print("|      ");

                }

            } // end for c
            if (r == 0) {
                System.out.print("|");
            }

            System.out.println();

        } // end for r

        System.out.println("THANK YOU!");

    }// end main
}// end class