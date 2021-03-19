/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JFrame;

/**
 *
 * @author turha
 */
public class BBMain {
    
    public static final int WIDTH = 800, HEIGHT = 600;
    
    public static void main(String[] args) {
    
    JFrame theFrame = new JFrame("Brick Breaker");
    
    Game thePanel = new Game();
    
    theFrame.setLocation(500, 200);
    theFrame.setResizable(false);
    theFrame.setSize(WIDTH,HEIGHT);
    theFrame.add(thePanel);
    theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    theFrame.setVisible(true);
    
    thePanel.playGame();
    }
    
}
