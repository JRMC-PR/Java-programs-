
/* Autor Jesus R. Mendez Cruz @Vaiosos
Cpen358
 * Ejercicio numero 1:llener y passar un arreglo doble a un file
 * Luego pasar la parte entera a un array entero
 */
import java.util.*;
import java.io.*;

public class ArrayAFile {

    public static void main(String[] args) throws IOException {
        try {
            // Creamos un objeto scanner para leer imputs del usuario
            Scanner userInput = new Scanner(System.in);

            // Declarar variables
            int arraySize, i, userOption;
            double numeros;
            String filename;// guardar el nombre del fiel que entre el usuario

            /*
             * Preguntar al usuario que tan grande quiere el array
             * y si desea los numeros random
             */
            System.out.print("Buenvenido! De que tamaño desea el array?: ");
            arraySize = userInput.nextInt();

            // Crear el Array con el tamaño deseado por el usuario
            double Array1[] = new double[arraySize];

            // Crear el array tipo Int
            int Array2[] = new int[arraySize];

            // Decidir si el arreglo se llenara de manera random o manual
            System.out.print("Entre [1] si desea llenar el Arreglo manual / Entre [2] para valores random: ");

            userOption = userInput.nextInt();

            // identificar la opcion entrada y popular los arrays
            if (userOption != 1) {
                // Popular el array de forma random
                System.out.println("El array es:");
                for (i = 0; i < arraySize; i++) {
                    int k = i + 1;
                    numeros = (double) (Math.random() * 100 + 1);/// generates randome numbers to fill the array
                    Array1[i] = numeros;
                    System.out.printf(k + "--" + "%.2f", Array1[i]);
                    System.out.println();

                } // end random for
            } else {
                // popular el array de forma manual

                for (i = 0; i < arraySize; i++) {
                    int k = i + 1;
                    System.out.println("Porfavor de entrar un numero tipo Double: ");
                    Array1[i] = userInput.nextDouble();
                    System.out.printf(k + "--" + "%.2f", Array1[i]);
                    System.out.println();

                } // end manual for
                System.out.println("El arry es: ");
                for (i = 0; i < arraySize; i++) {// Muestra el array entrado manualmente
                    int k = i + 1;
                    System.out.printf(k + "--" + "%.2f", Array1[i]);
                    System.out.println();

                } // end for para mostrar el array manual

            } // end else

            // preguntar al usuario el nombre del file y parar la data

            System.out.println("Como desea llamar el file?");
            System.out.print("No olvide el (.txt) al final del nombre:");
            System.out.println();

            userInput.nextLine();// consume el new line

            filename = userInput.nextLine();// Guardamos el nombre del file en la variable file name

            System.out.println("El nombre del file es: " + filename);// Muestra el nombre de file entrado

            // Crear el file y popular

            PrintWriter outputFile = new PrintWriter(filename);// pasamos el nombre del file como argumento al objeto
            // pasar la data del array al file
            for (i = 0; i < arraySize; i++) {
                outputFile.println(Array1[i]);

            } // end for
            outputFile.close();// closes file

            // Leer y pasar el contenido del File al array
            File file = new File(filename);// entrada / o un file q ya existeñ
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                for (i = 0; i < Array2.length; i++) {// para moverse atraves del array y llenarlo con lo svalores nuevos
                    Array2[i] = (int) inputFile.nextDouble();// leer file linea por linea
                    System.out.println(Array2[i]);
                }
                inputFile.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File non existant ");

        }
    }// end main

}// end class