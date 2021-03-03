/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit111online2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Program to ask user a series of questions to compute an overall friend
 * compatibility score
 * 
 * @author edith
 */
public class FriendMachine {
    
    final static int COMPAT_THRESHOLD = 100;
    
    public static void main(String[] args){
        // create variables with sensible initial values
        int compatScore = 0;
        int responseNum = -9;
        Scanner scan = new Scanner(System.in);
        
        //Welcome user and ask Q1
        System.out.println("Welcome to Loretta's Friend Machine");
        System.out.println("Question 1: Would you consider youself a crane enthusiast?");
        System.out.println("Yes = 1; No = 0");
        // use scanner to grab user input
        
        
        do{
            
            try { // call any methods that would throw an exception in these { .. }
                scan = new Scanner(System.in);
                responseNum = scan.nextInt();

            } catch (InputMismatchException ex){
                System.out.println("Oops, you  must enter an integer!");

            } // close try/catch
        } while (responseNum == -9); // -9 is holding value; if input isn't correct
        // keep asking
        
        // evaluate response to Question 1; yes = 1, no = 0
        if(responseNum == 1){
            // only run if user is enthusiast
            System.out.print("Excellent; Cranes are, as you probably know, ");
            System.out.println("the best kept secret to happiness!");
            
            // give user 100 points for being a crane enthusiast
            compatScore = compatScore + 100;
            
            // ask question 1: crane types only if they are enthusiasts
            // "nested question"
            System.out.println("Question 2: Which crane type is most thrilling?");
            System.out.println("H-Truss = 1");
            System.out.println("Cable hoist = 2");
            System.out.println("Boom = 3");
            
            responseNum = scan.nextInt();
            
            if(responseNum == 1){
                System.out.println("Yes, an H-truss is very rigid");
                compatScore = compatScore + 20;
            } else if(responseNum == 2){
                System.out.println("Cable hoists are, in fact, superior");
                compatScore = compatScore = 200;
            } else if(responseNum == 3){
                System.out.println("Boom cranes are great for trucks and boats");
                compatScore = compatScore + 50;
            } else {
                System.out.println("Not a valid answer; no points for you!");
            }
            
            
        } else {
            // for non-enthusiasts
            System.out.println("No Cranes!? Don't break your back!");
            System.out.println("Skipping question 2");
        } // close if/else of crane question Q1
        
        // reunite logic on question 3
        System.out.println("Question 3");
        System.out.println("Are you a linux user? Yes = 1; No = 0");
        // read in answer from user
        
        scan = new Scanner(System.in);
        
        try{
            responseNum = scan.nextInt();
        } catch (InputMismatchException ex){
            System.out.println("You must enter a number");
        }
        
        
        if(responseNum == 1){
            System.out.println("See ya later, Bill!");
            compatScore = compatScore + 80;
        } else {
            System.out.println("The new horizon of linux awaits you!");
            compatScore = compatScore - 10;
        } // close question 3 if/else
        // display scores:
        System.out.print("Your compatability score is: ");
        System.out.println(compatScore);
        System.out.print("Based on a friend threshold score of: ");
        System.out.println(COMPAT_THRESHOLD);
        
        //final friend compat determination
        if(compatScore >= COMPAT_THRESHOLD){
            System.out.println("Determination: High friend liklihood");
        } else {
            System.out.println("Determination: Low friend liklihood");
        }
        System.out.print("Thanks for using the friend machine; determination ");
        System.out.println("is preliminary and tentative!");
        
        
    } // close main method
    
} // close class
