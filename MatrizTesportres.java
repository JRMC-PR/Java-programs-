
/* ejercicio numero 2
Arrays y matrices 
Author jesus R. Mendez Cruz @Vaiosos*/

import java.util.*;

public class MatrizTesportres {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);/*
                                                    * / objeto scanner que leera
                                                    * lo q uelusiuaria entre
                                                    */
        // declaacion de variables
        int Asize1, Asize2, Asize3, i;// manejaran la cantidad de columnas
        double numbers, LongestArray, remaininglength;

        // pedir tamaño deseado de columnas
        System.out.print("Favor de entrar el tamaño del primer  vector: ");
        Asize1 = userInput.nextInt();
        System.out.print("Favor de entrar el tamaño del segundo vector: ");
        Asize2 = userInput.nextInt();
        System.out.print("Favor de entrar el tamaño del tercer  vector: ");
        Asize3 = userInput.nextInt();

        // Inicializar los Arrays

        double Array1[] = new double[Asize1];
        double Array2[] = new double[Asize2];
        double Array3[] = new double[Asize3];

        // Papular el array

        for (i = 0; i < Array1.length; i++) {
            numbers = (int) (Math.random() * 100 + 1);
            Array1[i] = numbers;
        } // end for
        for (i = 0; i < Array2.length; i++) {
            numbers = (int) (Math.random() * 100 + 1);
            Array2[i] = numbers;
        } // end for
        for (i = 0; i < Array3.length; i++) {
            numbers = (int) (Math.random() * 100 + 1);
            Array3[i] = numbers;
        } // end for

        // Ver que arreglo es mayor

        if (Array1.length > Array2.length) {

            LongestArray = Array1.length;// guarda el valor numerico de la cantidad de espacios el array

        } else {

            LongestArray = Array2.length;// guarda el valor numerico de la cantidad de espacios el array
        }
        if (Array2.length > Array3.length) {

            LongestArray = Array2.length;// guarda el valor numerico de la cantidad de espacios el array
        } else {

            LongestArray = Array3.length;// guarda el valor numerico de la cantidad de espacios el array
        } // end if else statament lines

        System.out.println("La matriz es: ");

        // Mostrar los arrays

        for (i = 0; i < Array1.length; i++) {
            System.out.print("|" + Array1[i]);
        } // end for
        System.out.print("|");
        if (Array1.length < LongestArray) {
            remaininglength = remaininglength(Array1.length, LongestArray);
            for (i = 0; i < remaininglength; i++) {
                System.out.print(" 0.0| ");
            } // end for

        } // end if
        System.out.println();
        for (i = 0; i < Array2.length; i++) {
            System.out.print("|" + Array2[i]);
        } // end for
        System.out.print("|");
        if (Array2.length < LongestArray) {
            remaininglength = remaininglength(Array2.length, LongestArray);
            for (i = 0; i < remaininglength; i++) {
                System.out.print(" 0.0 |");
            } // end for

        } // end if
        System.out.println();
        for (i = 0; i < Array3.length; i++) {
            System.out.print("|" + Array3[i]);
        } // end for
        System.out.print("|");
        if (Array3.length < LongestArray) {
            remaininglength = remaininglength(Array3.length, LongestArray);
            for (i = 0; i < remaininglength; i++) {
                System.out.print(" 0.0| ");
            } // end for

        } // end if
        userInput.close();

    }// end main

    /*
     * Este metodo verificara cuantos 0 habria que añadir,
     * para hacer la matriz pareja
     */
    public static double remaininglength(double alength, double llength) {
        double newLength;
        newLength = llength - alength;

        return newLength;

    }

}// en class
