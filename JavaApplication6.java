/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;
/**
 *
 * @author Vaiosos
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice = 0;
       double balance = 2804.55;
       double withdraw;
       double deposit;
       double transaction;
        Scanner t = new Scanner(System.in);
        
       System.out.println("1) deposit");
       System.out.println("2) withdraw");
       System.out.println("3) balance \n");
       
       
       System.out.println("please choose an option");
       choice = t.nextInt();
       
   if(choice == 1 ){
       System.out.println("how much would you like to deposit ?");
       transaction = t.nextDouble();
       balance +=transaction;
       System.out.println("your current balance is :$"+balance);
  
   }
   else{
       if(choice == 2){
           System.out.println("please enter how much you would like to withdraw");
           transaction= t.nextDouble();
            withdraw = transaction;
            balance -= withdraw;
            System.out.println("the ammount withdrawed is: $  "+withdraw );
            System.out.println("the remaining balance is : $  "+balance );
            
       }
       else {
           if(choice == 3){
               System.out.println("Your current balance is: $"+balance);
           }
       }
   }
  
        
   }
      
       
      
         
        // TODO code application logic here
    }
    

