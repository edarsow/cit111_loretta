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
    
    public static Envelope english11Bribe;
    
    public static void main(String[] args) {
        
        demoNullConcept();
        
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
        // 34A&AFFFF.idNumber
        
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
        System.out.println("Inside main, before print");
        displayEnvelopeValues(physicsBribe);
        
        /*
        
        TODO For Wednesday 21-APR'19: Call method removeCashFromEnvelope
        on both the phsics and linearAlgebra bribe
        and prove that our method works by passing 
        a reference to these objects down to our 
        printing method
        
        */
        // Use . dot to access the public method on our Envelope class
        physicsBribe.removeCashFromEnvelope(23.0);
        
        // prefix the words "Please give me a" to physics envelope text
//        prefixEnvelopeText(physicsBribe, "Please give me a");
        System.out.println("Inside main, before print");
        
        displayEnvelopeValues(physicsBribe);
        
        
    } // close main
    
    /**
     * Demonstrates that we'll blow up our programs
     * if we try to use the access (dot) operator
     * on a null value, i.e. access something on nothing
     */
    public static void demoNullConcept(){
        
        english11Bribe = new Envelope();
        english11Bribe.textOnFront = "No soup for Mr. Laar";
        // try to access the cashContents of the
        // object referenced by the variable
        // english11Bribe;
        // we can use an if and equality check with != to
        // avoid trying to access a mem var or method on nothing! (null)
        if(english11Bribe != null){
            System.out.println("English11 Cash: " + english11Bribe.cashContents);
            if(english11Bribe.textOnFront != null){
                System.out.println("English11 Text: " + english11Bribe.textOnFront.toUpperCase());
            } else {
                System.out.println("Found null textOnFront member var value");
            }
        } else {
            System.out.println("Found null Envelope!! Yikes!");
        }
        
    }
    
   /**
    * Utility method for dumping to console member variable values
    * @param env ANY INSTANCE OF OUR EVELOPE CLASS
    */
   public static void displayEnvelopeValues(Envelope env){
        // Reveal the values in our member variables:
        // using our access . (dot) operator to read values
        // from public member variables
        
        System.out.println("Envelope Values:");
        // we can access a static member using dot but this time we 
        // access on the "Class itself"
        System.out.println("Inspiration: " + Envelope.filmInspiration);
        System.out.println("Cash: " + env.cashContents);
        System.out.println("ID: " + env.idNumer);
        System.out.println("Text on Front: " + env.textOnFront);
       
   } // close utility method!
   
   /**
    * Demo of the concept that we are passing around
    * references to (i.e. remote controls to) objects
    * and we aren't making copies when we pass 
    * Known as "Pass by Reference" calling
    * @param env
    * @param prefix 
    */
   public static void prefixEnvelopeText(Envelope env, String prefix){
       System.out.println("Prefixing \"" + prefix + "\" to Envelope ID " + env.idNumer);
       // squish the prefix text in front of any given Envelope object's 
       // text!
       env.textOnFront = prefix + " " + env.textOnFront;
       
   }
    
    
} // close class
