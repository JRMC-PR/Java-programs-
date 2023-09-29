
/*Jesus R. Mendez Cruz 
*CPEn358
*Sec42
*/

// Iports the librays that will be used in the program
import javax.swing.JOptionPane;//dialog boxes 
import java.text.DecimalFormat;//round up
import javax.swing.ImageIcon;//import image 

public class BMI {

    public static double getHeight() // getter method us to convet the height into inches
    {
        String in;// string variable that will store the values momenterally entered from the
                  // dialong boxes
        double f, i, x;// variables that will manage the values of the height entered

        // these dialog boxes will show the user what he needs to do to enter the height
        // correctly
        JOptionPane.showMessageDialog(null, "Please enter your height in ft with inches");
        JOptionPane.showMessageDialog(null, "Example: if you are 6' 7'' enter 6 first then the 7 ");

        in = JOptionPane.showInputDialog("Feet");// prompt the user to enter the feet part of his/her height
        f = Double.parseDouble(in);// coverts the string into a double and saves the value to a variable
        in = JOptionPane.showInputDialog("Inches");// prompts the user to enter the inches part of his/hers height
        i = Double.parseDouble(in);// coverts the string into a double and saves the value to a variable

        x = (f * 12) + i;// convets feet to inches
        return x;// return the inches

    }// end getHeight

    public static void main(String[] args) {
        double w, h, b;// variables that will manage the values in the main
        String on;// string variable that will store the values momenterally entered from the
                  // dialong boxes
        DecimalFormat t = new DecimalFormat("#0.0");// creates a new object type decimal format
        ImageIcon pic = new ImageIcon("Bmi-chart.jpg");// creates a new object type image
        JOptionPane.showMessageDialog(null, "Welcome to the BMI calculator");// Show start message in a dialog box
        on = JOptionPane.showInputDialog("Please Enter your weight in pounds");// promts the user to enter hi weight in
                                                                               // pounds
        w = Double.parseDouble(on);// coverts the string into a double and saves the value to a variable

        h = getHeight();// assings the value obtained in the method to a variable

        b = (w / Math.pow(h, 2)) * 703;// Calculates the BMI
        String s;// will store a string value to be printed 

        
        // te following if lse statemts will verify and prinf the correct term for the weight of the person 
        if(b<=17.5)
        {
            s = "You are severely underweight";
        }else if(b>17.5&& b<=18.4)
            {
                s ="You are underweight";

            } else if(b>=18.5&& b<=25)
            {     

                s ="You are heatly";

            }else if(b>=25.1&&b<=30)
                {
                    s = "You are oer weight";

                }else if(b>=30.1&&b<40)
                {
                    s ="You are obese";
                }else
                {
                    s = "You are severly Obese ";
                }
        JOptionPane.showMessageDialog(null, "You'r BMI is: " + t.format(b) +"\n" +  s , "BMI table ",
                JOptionPane.INFORMATION_MESSAGE, pic);// prints the resould and a image of a bmi table

    }// end main

}// end class