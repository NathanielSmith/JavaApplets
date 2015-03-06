
package org.me.hello;

import java.applet.Applet;

/**
 *
 * @author Nathaniel D.Smith
 * Date: 3/6/15
 * A Program that accepts two floating point numbers
 * as input, then finds out which number is larger
 */
import java.awt.Graphics;
import javax.swing.*;

public class Larger extends Applet {
    String result;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        String firstNumber;
        String secondNumber;
        double number1;
        double number2;
        
        firstNumber = JOptionPane.showInputDialog(
        "Please enter first floating-point number: ");
        secondNumber = JOptionPane.showInputDialog(
        "Please enter second floating-point number: ");
        
        number1 = Double.parseDouble(firstNumber);
        number2 = Double.parseDouble(secondNumber);
        
        if(number1 > number2)
            result = number1 + " is larger.";
        if(number1 < number2)
            result = number2 + " is larger.";
        if(number1 == number2)
            result = number1 + "These two numbers are equal";
                    
    }//end of method init
    
//Now draw out the results
    public void paint(Graphics g){
        g.drawRect(15,10,270,20); //Drawing the Rectangle
        g.drawString(result,25,25); //Drawing result as a String at 25,25
    }//end paint
    
}//end class Larger
