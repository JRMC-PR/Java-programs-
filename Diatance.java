/*Jesus R. Mendez Cruz 
s01105428
 * 
 */
package diatance;
import java.util.Scanner;
/**
 *
 * @author Vaiosos
 */
public class Diatance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        boolean numeric = true;
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
        
        
        
        
        
    }
    public static void distance(double[]x,double[]y)
    {  double b, c,d, e, A;
        
           A = Math.sqrt(Math.pow(x[0]- y[0], 2)+Math.pow(x[1]-y[1], 2));
        
            return A;
             
        
    }
    
    
}
