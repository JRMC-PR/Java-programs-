/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pictureframe;

/**
 *
 * @author gresto19
 */
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
public class PhotoAlbum {
    ArrayList<ImageIcon>thumbnails;//thumbnail pics
    ArrayList<ImageIcon>photos;//full size photos
    public PhotoAlbum(){
        thumbnails=new ArrayList<ImageIcon>();
        photos=new ArrayList<ImageIcon>();
        int picNum=0;
        
        while((new File("thumbnail" + picNum + ".JPG").exists()))
        {
            ImageIcon thumb= new ImageIcon("thumbnail"+picNum+".jpg");
            ImageIcon full= new ImageIcon("photo"+picNum+".jpg");
            thumbnails.add(thumb);
            photos.add(full);
            picNum++;
         }
    }
    public ImageIcon getPhoto(int i){
        return photos.get(i);
    }
    public ImageIcon getThumbnail(int i){
        return thumbnails.get(i);
    }
    public int numPhotos(){
        return photos.size();
    }
}

