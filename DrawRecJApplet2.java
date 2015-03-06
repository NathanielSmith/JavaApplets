
package org.me.hello;

import javax.swing.JApplet;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * An JApplet that allows the user to input values for the 
 * arguments required for method drawRect, then draws out the
 * rectangle using the four input values.
 */
import java.awt.*;
import javax.swing.*;

public class DrawRecJApplet2 extends JApplet {

    int upperLeftX, upperLeftY;
    int width, height;
    
    public void init() {
        
       String inputString;
        
       inputString = JOptionPane.showInputDialog("Enter upper left X: ");
       upperLeftX = Integer.parseInt(inputString);
       
       inputString = JOptionPane.showInputDialog("Enter upper left Y: ");
       upperLeftY = Integer.parseInt(inputString);
       
       inputString = JOptionPane.showInputDialog("Enter upper width: ");
       width = Integer.parseInt(inputString);
       
       inputString = JOptionPane.showInputDialog("Enter height: ");
       height = Integer.parseInt(inputString);
             
    }//end of method init

   //paint time : ) 
    public void paint(Graphics g){
        g.drawRect(upperLeftX, upperLeftY, width, height);
    }//end paint
}//end class DrawRecJApplet2
