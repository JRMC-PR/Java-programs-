/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package descuentopropiedades;
import java.util.Scanner;
/**
 *
 * @author Vaiosos
 */
public class DescuentoPropiedades {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
    public static void main(String[] args) {
         /*these are the variables that the program 
        will utilze for the proces of 
        calculating the tax of the property0.065
        */
        double houseValue = 0  ;
        double discount = 0 ; 
        double tax = 0.065;
        double totalValue  ;
        String ans;
        char answer;
        //this is the scanner that will read the user imputs 
        
        Scanner t = new Scanner(System.in);
       
        //ask the user for the information neaded 
        System.out.println("please enter the value of the property");
        houseValue = t.nextDouble();
        System.out.println("Are you currently living in the house ?");
        ans= t.nextLine();
       answer = ans.charAt(0);
        //the following if statement will verify the discounts 
        if(answer == 'y'|| answer == 'Y'){
            discount = 25000; 
        }
        
        
        System.out.println("Are you a Widow/WidoOwer ?");
        ans = t.nextLine();
        answer = ans.charAt(0);
        
    
        if(answer == 'y'|| answer == 'Y'){
            discount += 500;  
            
        }
        System.out.println("Do you have any disabilities");
        ans = t.nextLine();
        answer = ans.charAt(0);
        if(answer == 'y'|| answer == 'Y'){
            discount += 500; 
            
        }
        System.out.println("Are you older than 65 and have lived the property for more than 25 year  consecutivly ??");
        ans = t.nextLine();
        answer = ans.charAt(0);
        if(answer == 'y'|| answer == 'Y'){
            discount += 5000 ; 
            
        }
        
        totalValue = (houseValue - discount)*tax ;
        System.out.println("The total value of your property is " +totalValue );
        
     
        
     
        
        // TODO code application logic here
                
    }
    
}
