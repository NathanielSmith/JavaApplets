
package org.me.hello;

import javax.swing.JApplet;

/**
 *
 * @author Nathaniel D. Smith
 *Date: 3/6/15
 * An JApplet that calculates the squares 
 * and cubes of the numbers from 0 to 10 
 * and draws the resulting values in table. 
 */
import java.awt.*;
import javax.swing.*;

public class NumbersJApplet extends JApplet {
    
    public void init() {
        // NA
    }
    
    public void paint(Graphics g){
 
      g.drawString("number",5,15);
      g.drawString("Square",70,15);
      g.drawString("Cube",145,15);
      
      int x = 0;
      g.drawString("" + x, 5, 30);
      g.drawString("" + (x * x), 70, 30);
      g.drawString("" + (x*x*x), 145, 30);
      
      x = 1;
      g.drawString("" + x, 5, 45);
      g.drawString("" + (x * x), 70, 45);
      g.drawString("" + (x*x*x), 145, 45);
      
      x = 2;
      g.drawString("" + x, 5, 60);
      g.drawString("" + (x * x), 70, 60);
      g.drawString("" + (x*x*x), 145, 60);
      
      x = 3;
      g.drawString("" + x, 5, 75);
      g.drawString("" + (x * x), 70, 75);
      g.drawString("" + (x*x*x), 145, 75);
      
      x = 4;
      g.drawString("" + x, 5, 90);
      g.drawString("" + (x * x), 70, 90);
      g.drawString("" + (x*x*x), 145, 90);
      
      x = 5;
      g.drawString("" + x, 5, 105);
      g.drawString("" + (x * x), 70, 105);
      g.drawString("" + (x*x*x), 145, 105);
      
      x = 6;
      g.drawString("" + x, 5, 120);
      g.drawString("" + (x * x), 70, 120);
      g.drawString("" + (x*x*x), 145, 120);
      
      x = 7;
      g.drawString("" + x, 5, 135);
      g.drawString("" + (x * x), 70, 135);
      g.drawString("" + (x*x*x), 145, 135);
      
      x = 8;
      g.drawString("" + x, 5, 150);
      g.drawString("" + (x * x), 70, 150);
      g.drawString("" + (x*x*x), 145, 150);
      
      x = 9;
      g.drawString("" + x, 5, 165);
      g.drawString("" + (x * x), 70, 165);
      g.drawString("" + (x*x*x), 145, 165);
      
      x = 10;
      g.drawString("" + x, 5, 180);
      g.drawString("" + (x * x), 70, 180);
      g.drawString("" + (x*x*x), 145, 180);
      
      
    }
    
}
