
//this is exercise #4
import java.util.*;
import javax.swing.*;

public class Hotel {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);
        double TazaDeOcupacion;
        int Floors, TotalRooms = 200, UserRooms, FreeRooms = 0, OcupiedRooms = 0, FloorCount = 0;
        double OcupationRate;
        String Pinput;

        JOptionPane.showMessageDialog(null, " Welcome to the holtel ");
        Pinput = JOptionPane.showInputDialog(null, "Please enter the nmber of floors followed by the rooms " + "\n"
                + "(The numbers of rooms available by floor is 200)");
        Floors = Integer.parseInt(Pinput);

        while (Floors < 1) {
            Pinput = JOptionPane.showInputDialog(null, " Invalid Floor number  Enter  number grater than 1! ");
            Floors = Integer.parseInt(Pinput);
        }

        int Hotel[][] = new int[Floors][TotalRooms];

        // populate the hotel

        for (int f = 0; f < Floors; f++) {// floors

            Pinput = JOptionPane.showInputDialog(null,
                    "Please enter the amount of rooms available for floor #" + (FloorCount + 1) + ":: ");

            UserRooms = Integer.parseInt(Pinput);

            while (UserRooms < 10) {
                Pinput = JOptionPane.showInputDialog(null, " Invalid Room number " + " \n"
                        + "Enter  number grater than 10! For floor "
                        + (FloorCount + 1));
                UserRooms = Integer.parseInt(Pinput);

            }

            FloorCount++;

            for (int r = 0; r < TotalRooms; r++) {// rooms

                if (r < UserRooms) {
                    Hotel[f][r] = 1;// full room
                } else {
                    Hotel[f][r] = 0;// empty room
                }

            } // end inner for

        } // end for

        // analize the hotel for results
        for (int f = 0; f < Floors; f++) {
            for (int r = 0; r < TotalRooms; r++) {

                if (Hotel[f][r] == 1) {
                    OcupiedRooms++;

                } else if (Hotel[f][r] == 0) {
                    FreeRooms++;

                }

            } // end inner for

        } // end outer for

        // Calculate the ocupation rate

        OcupationRate = (OcupiedRooms / TotalRooms);

        JOptionPane.showMessageDialog(null, "The max Capacity of the hotel is: " + (TotalRooms * Floors) + " \n"
                + "The number of ocuoied rooms is: " + OcupiedRooms + " \n "
                + " The number of free rooms is " + FreeRooms + " \n"
                + "The ocupation rate of the hotel is: " + OcupationRate);

    }// end main
}// end main.