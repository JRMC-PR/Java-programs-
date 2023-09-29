// Main function for Fast Food company 

import java.util.*;

import javax.swing.*;

public class FastFoodMain {
    public static void main(String[] args) {
        Scanner UserInput = new Scanner(System.in);

        // VAriables

        double Miles = 0, PackageWeight = 0.0, Price = 0.0;
        String Buyer = " ", WhereTo = " ", WhereFrom = " ", Pinput;

        FastFoodCompany FF1 = new FastFoodCompany(PackageWeight, Price, Miles, Buyer, WhereTo,
                WhereFrom);

        // System.out.println("This is the prcie: " + FF1.DistanceCharge(FF1.Miles));

        JOptionPane.showMessageDialog(null, "Welcome To The Fast Food Company Shipping Service");

        Pinput = JOptionPane.showInputDialog("Please enter the Package Weight:");
        FF1.PackageWeight = Double.parseDouble(Pinput);
        Pinput = JOptionPane.showInputDialog("Please enter the Distance in miles ");
        FF1.Miles = Double.parseDouble(Pinput);
        Pinput = JOptionPane.showInputDialog("Please enter the Buyer: ");
        FF1.Buyer = Pinput;
        Pinput = JOptionPane.showInputDialog("Please enter the Destination:");
        FF1.WhereTo = Pinput;
        Pinput = JOptionPane.showInputDialog("Please enter the Origin:  ");
        FF1.WhereFrom = Pinput;

        JOptionPane.showMessageDialog(null,

                "The Distance in Miles is: " + FF1.Miles + " miles" + "\n"
                        + "The Cost for shipping + Pacakge cost wil be of: $"
                        + (FF1.PackageCost(FF1.PackageWeight, FF1.Price) + FF1.DistanceCharge(FF1.Miles)) + " \n"
                        + "The Buyer is:  " + FF1.Buyer + " \n"
                        + "The seller: " + FF1.OwnerCompany + "\n"
                        + "Package destination:  " + FF1.WhereTo + "\n"
                        + "Package origin: " + FF1.WhereFrom,
                "Fast Food Company ", 0);
        // Show the information
    }
}