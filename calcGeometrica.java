import java.util.Scanner;
import java.text.DecimalFormat;

public class calcGeometrica {

    public static void main(String[] args) {
        double r, b, h, l, w, A;
        int m;
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.0");

        do {
            printMenu();
            System.out.print("Opcion: ");
            m = input.nextInt();// input menu
            m = inValMenu(m);// input validation

            // estructura seleccion - Opcion del menu
            if (m == 1) {
                System.out.print("Radio: ");
                r = input.nextDouble();
                r = inVal(r);
                A = calcAC(r);
                System.out.println("area circulo = " + f.format(A));
            } else if (m == 2) {
                System.out.print("Base: ");
                b = input.nextDouble();
                b = inVal(b);
                System.out.print("Altura: ");
                h = input.nextDouble();
                h = inVal(h);
                A = calcAT(b, h);
                System.out.println("area triangulo = " + f.format(A));
            } else if (m == 3) {
                System.out.print("Largo: ");
                l = input.nextDouble();
                l = inVal(l);
                System.out.print("Ancho: ");
                w = input.nextDouble();
                w = inVal(w);
                A = calcAR(l, w);
                System.out.println("area rectangulo = " + f.format(A));
            } else
                System.out.println("Bye!");

        } while (m != 4);
    }// main

    public static void printMenu() {
        System.out.println("\n\tCalculadora Geometrica\n");
        System.out.println("1. Area Circulo\n2. Area Triangulo");
        System.out.println("3. Area Rectangulo\n4.Salir\n");
    }

    public static int inValMenu(int m) {
        Scanner input = new Scanner(System.in);

    }

    public static double calcAC(double r) {

        return Math.PI * Math.pow(r, 2);
    }

    public static double calcAT(double b, double h) {
        return 0.5 * b * h;
    }

    public static double calcAR(double l, double w) {
        return l * w;
    }

    public static double inVal(int x) {
        while (x <= 0) {
            System.out.println("\tError!  El dato debe ser mayor que 0 ");
            Scanner input = new Scanner(System.in);
            x = input.nextInt();
            return x;
        }
    }
}// end class