/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author vaiosos
 */
import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this will print out a dialog box that tge user will see and will be abel to enter the  information that the program is asking for 
       String i1 = JOptionPane.showInputDialog("Please enter the cars model name : ");
        int i3 = Integer.parseInt(JOptionPane.showInputDialog("Please enter the final milage fo the Trip: "));
       String type = JOptionPane.showInputDialog("Is the car small(12 galons) or Big  (16 galons)?"); 
       
        AutoCalculate auto1 = new AutoCalculate();
        String nombre = auto1.model(i1, type);
       
        int rendimiento = auto1.calcular(i3, 12);
        auto1.display(name, performance);
       
       
       
       
       
    }
   
}
