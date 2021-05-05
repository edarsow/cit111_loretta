/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Custom type representing a one of Zane's Neighbor's 
 * co-opted satellite dish
 * @author edith
 */
public class NeighborDish {
    
    public String neighborAddress;
    public boolean zaneControlled;
    
    public double diameter;
    
    public double latitude;
    public double longitude;
    
    public double rotationAngle;
    public double incline;
    
    public void changeDishControl(boolean controlStatus){
        
        zaneControlled = controlStatus;
    } // close changeDishControl
    
    @Override
    public String toString(){
        // assemble a train of strings, and return the 
        // entire train at the end of the method
        StringBuilder sb = new StringBuilder();
        sb.append("Neighbor address: " + neighborAddress);
        sb.append(" | Diameter: " + diameter);
        sb.append(" | Lat: " + latitude);
        sb.append(" | Lon: " + longitude);
        sb.append(" | Is Zane controlling? " + zaneControlled);
        
        return sb.toString();
    } // end toString
    
    
    
} // close class
