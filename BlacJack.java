/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundprojs_sp21;

import java.util.Random;
import java.util.Scanner;

/**
 * Sample approach to card-based interaction
 * 
 * Components for thought concerning a BlackJack game program
 * Design goal: Represent playing cards which have a 
 * point value associated with them based on the rules of BlackJack.
 * We'll do so using integer values that are mapped to various card types
 * 
 * @author Lily and Edith
 */
public class BlacJack {
    
    // member vars
    static int humanCardFaceDown;
    static int humanCard1;
    static String humanCard1SuiteColor;
    static int humanCard2;
    static int humanCard3;
    
    static int computerCardUnknown;
    static int computerCard1;
    static int computerCard2;
    static int computerCard3;
    
    public static void main(String[] args) {
        // delegate all work to our controller method
        controlGamePlay();
        
        
        
    } // close main
    
    public static void controlGamePlay(){
        // Step 1: setup hands
        setupHands();
        // check status of our tool
        determineHumanCardPointTotal();
        // give human user a chance to choose action
        
        do{
            System.out.println("Do you want to hit or hold?");
            Scanner scan = new Scanner(System.in);
            String playChoice = scan.nextLine();
            if(playChoice.toLowerCase().equals("hit")){
                humanPlayerHit();
                determineHumanCardPointTotal();
            } else {
                break;
            }
        } while(true);
        
        System.out.println("I'm not done yet!");
        
    } // close controlGamePlay
    
    public static void setupHands(){
        System.out.println("Setting up hands...");
        // generate cards for humanFaceDown & card 1
        humanCardFaceDown = generateRandomCard();
        humanCard1 = generateRandomCard();
        // generate cards for compUnknown and card 1
        computerCardUnknown = generateRandomCard();
        computerCard1 = generateRandomCard();
        
        
    }
    
    public static void humanPlayerHit(){
        if(humanCard2 == 0){
            humanCard2 = generateRandomCard();
        } else {
            humanCard3 = generateRandomCard();
        }
    }
    
    /**
     * Simulate the drawing of a card from a playing card
     * deck. The card value is represnted as an int
     * between 2 through 11 with aces as 11 (we'll let
     * the compute point total method deal with the
     * situation of counting an ace as 1 pt)
     * @return random card value
     */
    public static int generateRandomCard(){
        int cardVal;
        // make rand generator
        Random rnd = new Random();
        // ask generator for value between 2 and 11
        // remember: the upper bound is exclusive, so 
        // we want to get 11s drawn, so bound is 11+1 = 12
        do{
            cardVal = rnd.nextInt(12);
            System.out.println("Randomly drew: " + cardVal);
        } while(cardVal == 0 || cardVal == 1);
        
        return cardVal;
        
    } // close genrandomCard
    
    public static void determineHumanCardPointTotal(){
        System.out.println("*** HUMAN HAND STATUS *** ");
        System.out.println("Face Down: " + humanCardFaceDown);
        System.out.println("Card 1: " + humanCard1);
        System.out.println("Card 2: " + humanCard2);
        System.out.println("Card 3: " + humanCard3);
        // track total hand points in variable
        int handPoints = humanCardFaceDown;
        
        if(humanCardFaceDown == 11 && humanCard1 == 11){
            handPoints = handPoints + 1;
        } else {
            handPoints = handPoints + humanCard1;
        }
        System.out.println("Current human hand points: " + handPoints);
        
        
        
    } // close determine...
    
    
    
    
} // close class
