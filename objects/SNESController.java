/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Sample game controller class
 * @author edith
 */
public class SNESController {
    
    public boolean x;
    public boolean y;
    public boolean a;
    public boolean b;
    public boolean left_trigger;
    public boolean right_trigger;
    public boolean select;
    public boolean start;
    
    public void press_x(){
        System.out.println("X button pressed");
        if(x == false){
            x = true;
        } else {
            x = false;
        }
    }
    
    public void press_y(){
        System.out.println("Y button pressed");
    }
    
    public void press_a(){
        System.out.println("Mario Jumps!");
        if(a == false){
            a = true;
        } else {
            a = false;
        }
        
    }
    public void press_b(){
        System.out.println("Mario running...faster!");
        if(b == false){
            b = true;
        } else {
            b = false;
        }
        
    }
    
}
