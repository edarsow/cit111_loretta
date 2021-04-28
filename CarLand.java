/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.time.LocalDateTime;

/**
 *Client class of our Car object model
 * CIT -111 Spring 2021
 * @author edith
 */
public class CarLand {
    
    public static void main(String[] args) {
        // make an instance of our car class and store 
        // a reference in a variable calle deLorean
        Car deLorean = new Car();
        deLorean.year = 1983;
        deLorean.makeModel = "DeLorean DMC-12";
        // asking the intance of Car pointed to by deLorean
        // to display its own member variables
//        deLorean.displayThisCarsStats();
        // alternatively, we can pass a reference to ANY 
        // car object to our static method in this class
        displayCarStats(deLorean);
        deLorean.startEngine();
        System.out.println("Speed: " + deLorean.accelerate(56));
        deLorean.displayThisCarsStats();
        deLorean.turnOnTimeCircuit();
        
        // create an object representing Nov. 5 1955
        LocalDateTime redLetterDate = LocalDateTime.of(1955, 11, 5, 0, 0);
        // pass destination into our setter method
        deLorean.setDestinationTime(redLetterDate);
        deLorean.displayThisCarsStats();
        // hopefully, escape the angry bomb customers
        deLorean.accelerate(40);
        
        
    } // close main
    
    
    /**
     * Asks a given car object for information about itself
     * and dumps to console
     * @param car an instance of our class Car
     */
    public static void displayCarStats(Car car){
        System.out.println("STATIC METHOD ON CARLAND");
        System.out.print("*****");
        System.out.print(car.year);
        System.out.print(" ");
        System.out.print(car.makeModel);
        System.out.println("*****");
        
        System.out.println("Engine on: " + car.isEngineRunning);
        System.out.println("CurrentSpeed: " + car.speed);
        System.out.println("**********");
        
    } // close displayCarStats
    
    
} // close class CarLand
