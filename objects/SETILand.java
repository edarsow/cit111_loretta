/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.util.Random;

/**
 * Demo of creating an array of custom objects!
 * @author edith
 */
public class SETILand {
    
    public static void main(String[] args) {
        // Create an array that can hold ONLY
        // references to our custom class: NeighborDish
        NeighborDish[] zanesArray = new NeighborDish[20];
        
        // use a for loop to make a bunch of instances
        // of our custom type: NeighborDish
        for(int s = 0; s < zanesArray.length; s++){
            System.out.println("Creating dish for index " + s);
            // Pattern: create a single instance of NeighborDish
            NeighborDish tempDish = new NeighborDish();
            // Configure it's member variables
            Random r = new Random();
            // String.valueOf converts our random integer into a String
            tempDish.neighborAddress = String.valueOf(r.nextInt(100)) + " Maple";
            tempDish.diameter = r.nextDouble() * 100;
            tempDish.zaneControlled = r.nextBoolean();
            
            // we could strategically plot our dishes on a coordinate plane
            tempDish.latitude = r.nextDouble() * 10;
            tempDish.longitude = r.nextDouble() * 10;
            // stick it on a shelf in our array
            zanesArray[s] = tempDish;
        } // end for of satellite building
        
        displayArrayStats(zanesArray);
        
    } // close main
    
    /**
     * Shows us info about each object in a given array
     * @param dishArray
     */
    public static void displayArrayStats(NeighborDish[] dishArray){
        // Check that our caller didn't pass us null
        if(dishArray != null){
            // iterate over all of our dishes
            for(int c = 0; c < dishArray.length; c++){
                // check that this shelf points to an object
                System.out.print("Dish at index " + c + " ");
                if(dishArray[c] != null){
                    // Just send the entire object
                    // into println() and println() 
                    // will look for a method called toString()
                    // if found, our toString() will be called, 
                    // otherwise, the default toString() will 
                    // display the hashcode of the object
                    System.out.println(dishArray[c]);
                    
                } else {
                    System.out.println("No dish here!");
                }
            }
        }
    }
} // close class
