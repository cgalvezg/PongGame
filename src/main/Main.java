/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import classes.Window;
import javax.swing.JFrame;

/**
 *
 * @author pochi
 */
public class Main {
    
    public static void main(String[] args) {
        
        Window window = new Window();
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when press x, finish execution  
    }
    
}
