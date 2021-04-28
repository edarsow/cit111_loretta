/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

import java.time.LocalDateTime;

/**
 * Model a vehicle with methods acting on member variables
 * 
 * @author edith
 */
public class Car {
    
    public int year;
    public String makeModel;
    public boolean isEngineRunning;
    public double speed;
    
    // MEMBER VARS FOR TIME TRAVEL
    private boolean isTimeCircuitOn;
    private LocalDateTime destinationTime;
    private LocalDateTime presentTime;
    final double TIME_TRAVEL_THRESOLD_SPEED = 88.0;
    
    /**
     * This is a special method called a constructor
     * and is called when we make an instance of Car with
     * new
     */
    public Car(){
        System.out.println("Constructing instance of Car...");
        presentTime = LocalDateTime.now();
        
        
    }
    
    
    /**
     * Simulates starting the car's engine,
     * by turning the isEngineRunning variable to true
     */
    public void startEngine(){
        // if engine is off, turn it on
        if(!isEngineRunning){
            isEngineRunning = true;
            System.out.println("Vroom!");
        } else {
            System.out.println("Grrshhrk (Engine already on)");
        }
        
    } // close startEngine
    
    /**
     * Simulates stopping engine
     */
    public void stopEngine(){
        // if engine is on, stop it
        if(isEngineRunning){
            isEngineRunning = false;
            System.out.println("zgeerrump");
        } else {
            // tell user the car is off already
            System.out.println("Engine is not on; cannot turn off.");
        }
        
        
    } // close stopEngine
    
    /**
     * "Getter" method for isEngineRunning
     * @return the value of isEngineRunning
     */
    public boolean checkEngineStatus(){
        return isEngineRunning;
    }
    
    /**
     * Dumps member variables onto console
     */
    public void displayThisCarsStats(){
        System.out.println("NON-STATIC METHOD ON CAR");
        System.out.print("*****");
        System.out.print(this.year);
        System.out.print(" ");
        System.out.print(this.makeModel);
        System.out.println("*****");
        
        System.out.println("Engine on: " + this.isEngineRunning);
        System.out.println("CurrentSpeed: " + this.speed);
        System.out.println("Time Circuit armed: " + this.isTimeCircuitOn);
        System.out.println("Present time: " + this.presentTime);
        System.out.println("Destination time: " + this.destinationTime);
        System.out.println("**********");
    }
    
    /**
     * "getter" for currentSpeed
     * @return this instance's value of speed
     */
    public double getCurrentSpeed(){
        return speed;
    }
    
    /**
     * Simulates increasing car's speed
     * @param mphIncrease
     * @return car's speed after increase
     */
    public double accelerate(int mphIncrease){
        // business logic: don't let user accelerate car 
        // if car is off
        if(isEngineRunning){
            // adding increase of speed to current speed
            speed = speed + mphIncrease;
            // time machine will check time circuit and destination time
            // and jump back in time if threshold reached
            if(isTimeCircuitOn && destinationTime != null && speed >= TIME_TRAVEL_THRESOLD_SPEED){
                System.out.println("Flux Capacitor: Fluxing!!");
                System.out.println("[lots of sparks and electronic noises]");
                System.out.println("....Arrived in " + destinationTime);
                // simulate the DeLorean arriving at destination by setting 
                // present time to destination time
                presentTime = destinationTime;
                // also set desintation now to null
                destinationTime = null;
            }
        } else {
            System.out.println("Cannot accelerate: call startEngine() first");
        }
        // ship back new speed to caller
        return speed;
    }
    
    /**
     * Simulates slowing car down
     * TODO: edge case of electrical failure during drive
     * @param mphDecrease
     * @return speed after decrease
     */
    public double decelerate(int mphDecrease){
        if(isEngineRunning){
            // subtract decreased speed from car's current speed
            speed = speed - mphDecrease;
        } else {
            System.out.println("Cannot decelerate: call startEngine() first");
        }
        return speed;
    }
    
    // *************************************
    // **********TIME TRAVEL METHODS********
    // *************************************
    
    /**
     * toggles the member var to true
     */
    public void turnOnTimeCircuit(){
        isTimeCircuitOn = true;
        System.out.println("Time circuit armed; set your destination time");
        System.out.println("Current time: " + LocalDateTime.now());
    } // close method
    
    /**
     * Injects time in member variable for destination
     * @param dest time to travel to
     */
    public void setDestinationTime(LocalDateTime dest){
        // inject the destination time into member variable
        destinationTime = dest;
        System.out.println("Destination time set to: " + destinationTime);
    }
    
    
    
    
} // close class Car
