/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Scanner;

/**
 * Client class of our Envelope objects
 * 
 * @author edith
 */
public class BribeWorld {
    public static void main(String[] args) {
        
        // follow the same pattern with our custom class
        // AND when we create a custom class
        // we are ALSO creating a custom data type
        // physicsBribe stores a reference to an
        // instance of the Envelope class
        // new Envelope() means: hey, virtual machine
        // go into memory and reserve me space 
        // using class Envelope as a blueprint
        Envelope physicsBribe = new Envelope();
        // now that we have an instance of Envelope, 
        // access that instance through an appropriately
        // typed variable and the access . (dot) operator 
        physicsBribe.cashContents = 50.0;
        physicsBribe.idNumer = 1;
        physicsBribe.textOnFront = "B on Midterm";
        
        // Repeat for linear Algebra
        // remmeber: we can use our blueprint class
        // to make any number of instances of our class
        // in our computer's RAM
        Envelope linearAlgebraBribe = new Envelope();
        linearAlgebraBribe.cashContents = 20.0;
        linearAlgebraBribe.idNumer = 2;
        linearAlgebraBribe.textOnFront = "D in Linear Algebra";
        
        // call method, passing in a reference to (i.e. a remote control)
        // an instance of the Envelope class called physics bribe
        displayEnvelopeValues(physicsBribe);
        displayEnvelopeValues(linearAlgebraBribe);
        
        
    } // close main
    
   /**
    * Utility method for dumping to console member variable values
    * @param env ANY INSTANCE OF OUR EVELOPE CLASS
    */
   public static void displayEnvelopeValues(Envelope env){
        // Reveal the values in our member variables:
        // using our access . (dot) operator to read values
        // from public member variables
        
        System.out.println("Envelope Values:");
        System.out.println("Cash: " + env.cashContents);
        System.out.println("ID: " + env.idNumer);
        System.out.println("Text on Front: " + env.textOnFront);
       
   } // close utility method!
    
    
} // close class
