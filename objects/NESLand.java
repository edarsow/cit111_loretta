/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 * Client of SNESController
 * @author edith
 */
public class NESLand {
    public static void main(String[] args) {
        SNESController controller1 = new SNESController();
        controller1.press_a();
        controller1.press_b();
        multiButtonPress(controller1);
    }
    
    public static void multiButtonPress(SNESController contr){
        if(contr != null){
            if(contr.b == true && contr.a){
                System.out.println("Mario makes mega leap!");
            } else {
                System.out.println("Unrecognized combo");
            }
        }
    }
}
