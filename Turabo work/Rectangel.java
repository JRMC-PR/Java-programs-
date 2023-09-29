/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometriccalculatordemo;

/**
 *
 * @author Vaiosos
 */
public class Rectangel {
      
  public double l;
  public double w;
  
  //methos
  
  public double getArea (){
     return  l*w; 
  }
  
  public double getPerimeter(){
     return (2*l) + (2*w);
  }
}
