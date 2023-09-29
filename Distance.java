/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distance;

import java.util.Scanner;

/**
 *
 * @author Vaiosos
 */
public class Distance {
public static double getDistance()
    {  
        double b;
        double []x;
        x = new double[2];
        double []y;
        y = new double[2];
        Scanner t;
        t = new Scanner(System.in);
        System.out.println("Enter the firt point.");
        System.out.print("X sub 1:");
        x[0]=t.nextDouble();
        System.out.print("Y sub 1:");
        y[0] = t.nextDouble();
        System.out.println("Enter the second point.");
         System.out.print("X sub 2:");
        x[1] = t.nextDouble();
        System.out.print("Y sub 2.");
        y[1] = t.nextDouble();
        
        System.out.println("Point one:  "+"("+ x[0]+","+ y[0]+")" );
        System.out.println("Point two:  "+"("+x[1]+","+y[1]+")" );
    
        
          b = Math.sqrt(Math.pow(x[1]- x[0], 2)+Math.pow(y[1]-y[0], 2));
          
       
           return  b;
           
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a;
        a = getDistance();
        System.out.printf("The area is %.2f :",a);
        // TODO code application logic here
    }
    
}
