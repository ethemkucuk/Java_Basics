/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math_class_7;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class Math_class_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y; ");
        y = scanner.nextDouble();
        
        z = Math.sqrt((x*x)+(y*y));
        // Math.min , Math,.max , Math.round
        // Math.abs , Math.sqrt , Math.floor
        
        System.out.print("The Hypotenuse is : " + z);
        
        scanner.close();
        // TODO code application logic here
    }
    
}
