/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *Very first Object model based on
 * A Series Man by Joel and Ethan Cohen
 * @author edith
 */
public class Envelope {
    // Member variables:
    // Each instance of our Envelop Class will
    // have storage containers with these names
    // but can have unique values
    public double cashContents;
    public int idNumer;
    public String textOnFront;
    
    // Envelopes storing money can have that cash removed
    /**
     * Deducts inputted value from member variable CashContents
     * @param cashRemoved value to deduct from THIS instance
     * of Envelope
     */
    public void removeCashFromEnvelope(double cashRemoved){
        cashContents = cashContents - cashRemoved;
        if(cashContents < 0){
            cashContents = 0;
        } 
    }
    
    
} // close blueprint class
