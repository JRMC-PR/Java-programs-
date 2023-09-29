/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestodeautos;

/**
 *
 * @author vaiosos
 */
import java.util.*;
import java.text.DecimalFormat;
public class ImpuestoDeAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tax, value;
        String answer;
        char ans;
        Scanner input=new Scanner (System.in);
        DecimalFormat decimal=new DecimalFormat("#0.00");
        System.out.print("Es usted un distribuidor? ");
        answer=input.nextLine();
        ans=answer.charAt(0);
        if (ans=='s'||ans=='S')
        {
            System.out.print("Cual es el valor de su auto? ");
            value=input.nextDouble();
            if(value<20000)
            {
                tax=0.0008*value;
            }
            else
            {
                tax=1599+(0.0018*value);
            }
            System.out.println("El impuesto a pagar sera: $" + decimal.format(tax));
        }
        else
        {
          System.out.println("Cual es el valor de su auto? ");
            value=input.nextDouble();
            if(value<20000)
            {
                tax=0.001*value;
            }
            else
            {
                tax=2000+(0.002*value);
            }
            System.out.println("El impuesto a pagar sera: $" + decimal.format(tax)); 
        
        }
    }
    
}
