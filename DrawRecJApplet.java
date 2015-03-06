
package org.me.hello;

import javax.swing.JApplet;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * A simple JApplet that draws rectangles of different
 * sizes and locations
 */
import java.awt.*;
import javax.swing.*;

public class DrawRecJApplet extends JApplet {

    
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    public void paint(Graphics g){
        g.drawRect(10,10,50,50);
        g.drawRect(80,10,20,40);
        g.drawRect(100,100,80,45);
        g.drawRect(150,60,20,25);
    }
}
