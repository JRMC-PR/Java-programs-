/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vaiosos
 */
public class MobilePackage 
{ 
    // set class fields 
 public double  data; 
 public double tax; 
 public double fcc; 
 public double roaming; 
 public double plan ; 

    public MobilePackage(double data, double roaming, double plan) 
    {
        this.data = data;
        this.roaming = roaming;
        this.plan = plan;
        tax = .115;
        fcc = 7.54;
    }
         

  
  
  
    

    
}
   
    

