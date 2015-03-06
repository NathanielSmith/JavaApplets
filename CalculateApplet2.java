
package org.me.hello;

import java.applet.Applet;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/6/15
 * An applet that inputs three floating-point
 * numbers from the user and displays the sum,average, 
 * product, smallest and largest of these numbers as strings on the apAlet.
 */
import java.awt.Graphics;
import javax.swing.*;

public class CalculateApplet2 extends Applet {
    
    String dataString;
    String sumString;
    String aveString;
    String pdtString;
    String smallString;
    String largeString;
    
    public void init() {
       
        String inputString;
        
        double number1, number2, number3;
        
        inputString = JOptionPane.showInputDialog(
        "Enter the first floating-point value: ");
        
        number1 = Double.parseDouble(inputString);
        
        double smallest = number1;
        double largest = number1;
        
        inputString = JOptionPane.showInputDialog(
                "Enter second floating-point value: ");
        
        number2 = Double.parseDouble(inputString);
        
       if(smallest > number2) 
           smallest = number2;
       if(largest < number2)
           largest = number2;
       
       inputString = JOptionPane.showInputDialog(
                "Enter third floating-point value: ");
       
       number3 = Double.parseDouble(inputString);
       
       if(smallest > number3) 
           smallest = number3;
       if(largest < number3)
           largest = number3;
        
       double sum,ave,pdt;
       
       sum = number1 + number2 + number3;
       ave = sum/3.0;
       pdt = number1 * number2 * number3;
       
       dataString = "The numbers entered are " + number1 + " , " +
               number2 + " , " + number3;
       
       sumString = "The sum is " + sum;
       pdtString = "The product is " + pdt;
       smallString = "The smallest number is " + smallest;
       largeString = "The largest number is " + largest;
       
    }//end method init

    public void paint(Graphics g){
        
        g.drawRect(15,10,270,100);
        g.drawString(dataString,25,25);
        g.drawString(sumString,25,45);
        g.drawString(pdtString,25,65);
        g.drawString(smallString,25,85);
        g.drawString(largeString,25,105);

    }//end of method paint
}//end of class CalculateApplet2
