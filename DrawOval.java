
package org.me.hello;

import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * An JApplet that allows the user to input the four arguments required
 * by method draw-Oval, then draws an oval using the four input values.
 */
public class DrawOval extends JApplet {

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
        g.drawOval(upperLeftX, upperLeftY, width, height);
    }//end paint
}//end class DrawOval
