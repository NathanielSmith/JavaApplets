
package org.me.hello;

import javax.swing.JApplet;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * Java JApplet that draws
 * an oval and a rectangle with the same four arguments. 
 * The oval will touch the rectangle at the center
 * of each side.
 */
import java.awt.Graphics;
import javax.swing.*;

public class DrawOvalRec extends JApplet {    
    
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
        g.drawRect(10,10,50,50); //draws the rec 
        g.drawOval(10,10,50,50); //draw the oval inside our rec : ) 
    }
}//end class DrawOvalRec
