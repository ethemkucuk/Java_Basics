/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_input_4;
import java.util.Scanner;

/**
 *
 * @author Monster
 */
public class User_input_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();
        
        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("You like " + food);
        // TODO code application logic here
    }
    
}
