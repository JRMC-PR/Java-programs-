import java.util.Scanner;
public class Cuadratica {
public static void main (String arg[]){
  Scanner t = new Scanner(System.in);
  double a;
  double b; 
  double c; 
  double d;
  double x;
  double y;
  System.out.println("please enter the value of A");
  a = t.nextDouble();
  System.out.println("please enter the value of B");
  b = t.nextDouble();
  System.out.println("please enter the value of C");
  c = t.nextDouble();
  
  d = Math.pow(b,2)-4*a*c;
   
  if(d >= 0){
     x = (-b+Math.sqrt(d))/(2*a);
     System.out.printf(" the result of x is %,.2f", x);
     y = (-b-Math.sqrt(d))/(2*a);
    System.out.printf("  , the result of y is %,.2f" , y);
     
     
  
  }
  else {
    System.out.println(" the discriminant is negavive and canot be resolved");
  }
  
}
}