/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/**
 *
 * @author turha
 */
public class PowerUp {
    //Fields
    private int  x,y, dy, type, width, height;
    
    private boolean isOnScreen;
    
    private Color color;
    
    public final static int WIDEPADDLE = 4;
    public final static int FASTBALL = 5;
    public final static Color WIDECOLOR = Color.GREEN;
    public final static Color FASTCOLOR = Color.RED;
    
    //Constructor 
    public PowerUp(int xStart, int yStart, int theType, int theWidth, int theHeight){
    
        x = xStart;
        y = yStart;
        type = theType;
        width = theWidth;
        height = theHeight;
        
        if(type < 4) { type = 4; }
        if(type > 5) { type = 5;}
        if(type == WIDEPADDLE) {color = WIDECOLOR;}
        if(type == FASTBALL) {color = FASTCOLOR;}
        
        dy = (int)(Math.random()* 6 + 1);
        
        
    }
    
    public void draw(Graphics2D g){
            
        g.setColor(color);
        g.fillRect(x,y,width,height);
    }
    
    public void update(){
        
        y += dy;
        
        if(y > BBMain.HEIGHT){
            isOnScreen = false;
        }
        
    }
    
    
    public int getX(){
        return x;
    }

    public void setX(int newX){
        x = newX;
    }
    
    public int getY() { return y; }
    public void setY( int newY ) { y= newY; }
    
    public int getDY(){ return dy; }
    public void setDY( int newDY ) { dy= newDY; }
    
    public int getType() { return type; }
    public boolean getIsOnScreen(){ return isOnScreen; }
    public void setIsOnScreen(boolean onScreen) {isOnScreen = onScreen;}
    
    public Rectangle getRect(){
    
        return new Rectangle(x, y, width, height);
    
    }
    
}
