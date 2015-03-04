/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.hello;

import java.applet.Applet;
import java.awt.Graphics;
/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/4/15
 * First Created JavaApplet
 * An applet is a program written in the Java programming language 
 * that can be included in an HTML page, much in the same way an image
 * is included in a page. 
 */
public class MyApplet extends Applet {
    
    @Override
    public void paint(Graphics g){
        g.drawString("Hello applet", 50, 50);
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    //public void init() {
        // TODO start asynchronous download of heavy resources
   //}

    // TODO overwrite start(), stop() and destroy() methods
}
