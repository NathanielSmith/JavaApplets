
package org.me.hello;

import javax.swing.JApplet;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * An JApplet that asks the user to input the
 * radius of a circle as a floating-point number and
 * draws the circle’s diameter, circumference and area.
 */
import java.awt.Graphics;
import javax.swing.*;

public class CircleJApplet extends JApplet {

       String line1;
       String line2;
       String line3;
    
    public void init() {
       
        String input;
        double radius;
        
        input = JOptionPane.showInputDialog("Please enter radius: ");
        radius = Double.parseDouble(input);
        
        line1 = "Diameter is " + (2 * radius);
        line2 = "Area is " + (Math.PI * radius * radius);
        line3 = "Circumference is " + (2 * Math.PI * radius);
    }//end og method init

    //Draw results
    public void paint(Graphics g){
       g.drawString(line1, 25,30);
       g.drawString(line2, 25,45);
       g.drawString(line3, 25,60);
    }//end method paint
}//end class CircleJApplet
