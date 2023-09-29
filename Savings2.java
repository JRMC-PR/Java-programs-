
// ejercicio 7 
import java.io.File;
import java.io.IOError;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.*;
import javax.swing.*;

public class Savings2 {
    public static void main(String[] agrs) throws IOException {

        Scanner UserInput = new Scanner(System.in);

        double interestRate;
        String Pinput, Format = "#0.00";
        DecimalFormat format = new DecimalFormat(Format);

        JOptionPane.showMessageDialog(null, " Welcome! This is your bank   ");
        Pinput = JOptionPane.showInputDialog(null, "Enter The Isterest Rate fof Your Account: ");
        interestRate = Double.parseDouble(Pinput);

        double InitialValue = 500;

        SavingsAccount Account = new SavingsAccount(InitialValue, interestRate);

        File file = new File("Depositos.txt");
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            Account.addDeposit(inputFile.nextDouble());

        }
        inputFile.close();

        File file2 = new File("Retiros.txt");
        Scanner inputFile2 = new Scanner(file2);
        while (inputFile2.hasNext()) {
            Account.subtractWithdraw(inputFile2.nextDouble());
        }
        inputFile2.close();

        Account.calculateInterest();

        JOptionPane.showMessageDialog(null,
                "Your account balance is of:" + format.format(Account.getBalance())
                        + "\n" + "The acumulated interest rate is: " + format.format(Account.getInterest()));

    }// end main
}// end class