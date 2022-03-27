/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if_statements_9;

/**
 *
 * @author Monster
 */
public class If_statements_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // if statement = performs a block of code if it s condition evalutes to be true
        int age=75;
        
        if(age == 75){
            System.out.println("Ok Boomer!");
        }
        else if(age>=18){
            System.out.println("You are an adult!");
            
        }
        else if(age>=13){
        System.out.println("You are teenager");
        
        }
        else{
            System.out.println("You are not a adult ");
        
        }
        // TODO code application logic here
    }
    
}
