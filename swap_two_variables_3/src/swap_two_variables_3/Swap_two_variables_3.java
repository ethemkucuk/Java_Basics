/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap_two_variables_3;

/**
 *
 * @author Monster
 */
public class Swap_two_variables_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String x = "water";
        String y = "Kool-Aid";
        String temp;
        
        temp = x;
        x=y;
        y=temp;
        
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        // TODO code application logic here
    }
    
}
