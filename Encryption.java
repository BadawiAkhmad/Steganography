/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Steganography;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

/**
 *
 * @author akhma
 */
public class Encryption {
    
    
    public void convertImage(JFileChooser f ){
        File img = f.getSelectedFile();
        BufferedImage pic = null;
        try {
            pic = ImageIO.read(img);
        } catch (IOException ex) {
            Logger.getLogger(Encryption.class.getName()).log(Level.SEVERE, null, ex);
        }

        int [][]  cover = new int [pic.getHeight()][pic.getWidth()];
        for (int y = 0; y < cover.length; y++) {
            for (int x = 0; x < cover[y].length; x++) {
                cover [y][x] = pic.getRGB(x, y);
                System.out.print((cover[y][x]>>16)&0xFF);
            }System.out.println("");
        }
    }
}
