/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.hello;

import java.applet.Applet;
import java.awt.Graphics;
import javax.swing.*;

/**
 *
 * @author Nathaniel D. Smith
 * Date: 3/4/15
 * An JavaApplet that asks the user to enter two floating-point numbers, 
 * obtains the two numbers from the user and draws the sum, product, 
 * difference and quotient of the two numbers. 
 */
public class CalculateApplet extends Applet {
    
    String dataString;
    String sumString;
    String productString;
    String differenceString;
    String quotientString;
    
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    @Override
    public void init() {
        // TODO start asynchronous download of heavy resources
        String firstNumber, secondNumber;
        
        double number1, number2;
        
        firstNumber = JOptionPane.showInputDialog(
         "Enter first floating-point value: ");
        
        secondNumber = JOptionPane.showInputDialog(
         "Enter second floating-point value: ");
        
        number1 = Double.parseDouble(firstNumber);
        number2 = Double.parseDouble(secondNumber);
        
        double sum = number1 + number2;
        double product = number1 * number2;
        double difference = number1 - number2;
        double quotient = number1 / number2;
        
        dataString = "The numbers entered are " + number1 + "," + number2;
        
        sumString = "The sum is " + sum;
        productString = "The product is " + product;
        differenceString = "The difference is " + difference;
        quotientString = "The quotient is " + quotient;
                
    }//end of method init
    
    //draw applet background
    @Override
    public void paint(Graphics g){
        g.drawRect(15, 10, 270, 100);
        g.drawString(dataString, 25, 25);
        g.drawString(sumString, 25, 45);
        g.drawString(productString,25 ,65);
        g.drawString(differenceString,25 ,85);
        g.drawString(quotientString,25 ,105);
    }//end of method paint

    // TODO overwrite start(), stop() and destroy() methods
}//end of class Calculate
