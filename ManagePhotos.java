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
import java.awt.event.*;
public class ManagePhotos extends JFrame{
    private JButton nextButton;//this button shows the next nine thumbnails
    private JButton exitButton;//this button exit app
    private JPanel buttonPanel;//next and exit buttons
    private PhotoAlbum album;
    private JButton[] display;
    private JPanel displayPanel;
    private JLabel titleLabel;
    private JPanel titlePanel;
    private PictureFrame PictureFrame;
    int nextPicture;
    
    public ManagePhotos(){
        setTitle("Photos");
        setBounds(0,0,600,500);
        album=new PhotoAlbum();
        
        //here I create the title label and place it in the panel
        titleLabel=new JLabel();
        titleLabel.setFont(new Font("Comic Sans Serif", Font.BOLD,24));//tipo de letra y tamaño
        titleLabel.setForeground(Color.black);//aqui cambio el color de la letra
        titleLabel.setText("Uni Adventures!");//mensaje que dira
        titlePanel=new JPanel();
        titlePanel.add(titleLabel);
        
        //here I create the buttons and place it in the panel
        nextButton=new JButton("Next");
        if(album.numPhotos()<=9)
            nextButton.setEnabled(false);
        exitButton=new JButton("Exit");
        buttonPanel=new JPanel();
        buttonPanel.add(nextButton);
        buttonPanel.add(exitButton);
        
        //listeners
        nextButton.addActionListener(new ButtonListener());
        exitButton.addActionListener(new ButtonListener());
        
        //buttons for each thumbnails
        display=new JButton[album.numPhotos()];
        for (int i = 0; i < album.numPhotos(); i++) {
            display[i]=new JButton(album.getThumbnail(i));
            display[i].addActionListener(new ButtonListener());//listeners for each thumb
          
        }
        displayPanel=new JPanel();
        displayPanel.setLayout(new GridLayout(3,3));// 9 panels 
        for (int i = 0; i < 9; i++) {
            if(i<album.numPhotos())
                displayPanel.add(display[i]);
            //placing the thumbnails in a panel
            add(titlePanel,BorderLayout.NORTH);
            add(buttonPanel,BorderLayout.SOUTH);
            add(displayPanel,BorderLayout.CENTER);
        }
        //reset for nextPicture
        if (album.numPhotos()<9)
            nextPicture=0;
        else 
            nextPicture=9;
        
        setVisible(true);
        PictureFrame=new PictureFrame();
    }    
    private class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==nextButton){
                remove(displayPanel);
                displayPanel=new JPanel();
                displayPanel.setLayout(new GridLayout(3,3));
                
                for (int i = 0; i < 9; i++) {
                    displayPanel.add(display[nextPicture]);
                    nextPicture=(nextPicture+1)%album.numPhotos();
                }
                add(displayPanel, BorderLayout.CENTER);
                validate();
            }
            else if(e.getSource()==exitButton)
                    System.exit(0);
            else
                for (int i = 0; i < album.numPhotos(); i++) {
                    if(e.getSource()==display[i]){
                        PictureFrame.changePhoto(album.getPhoto(i));
                        PictureFrame.setVisible(true);
                        return;
                    }
                }
        }
    }
}