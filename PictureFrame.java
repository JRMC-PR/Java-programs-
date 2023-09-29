/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictureframedemo;

/**
 *
 * @author Vaiosos
 */
import java.awt.*;
import javax.swing.*;
public class PictureFrame extends JFrame{
    private JLabel pictureLabel;
    private JPanel picturePanel;
    public PictureFrame(){//default constructor
        super("Picture Frame");//invoke parent constructor
        JFrame PictureFrame=new JFrame();
        
        Toolkit tk=Toolkit.getDefaultToolkit();
        Dimension dim=tk.getScreenSize();//returns screen width,height
        setBounds(0,0,dim.width,dim.height);
        
        pictureLabel=new JLabel();
        picturePanel=new JPanel();
        picturePanel.add(pictureLabel);
        add(picturePanel,BorderLayout.CENTER);
    }
    public void changePhoto(Icon icon){
        pictureLabel.setIcon(icon);
    }
}