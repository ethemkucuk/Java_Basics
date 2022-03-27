/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switches_10;

/**
 *
 * @author Monster
 */
public class Switches_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // switch = statement that allows a variable to be tested for equality against a list of values
        String day = "Friday";
        
        switch(day){
            case "Sunday": System.out.println("It is Sunday!");
            break;
            case "Monday": System.out.println("It is Monday!");
            break;
            case "Tuesday": System.out.println("It is Tuesday!");
            break;
            case "Wednesday": System.out.println("It is Wednesday!");
            break;
            case "Thursday": System.out.println("It is Thursday!");
            break;
            case "Friday": System.out.println("It is Friday!");
            break;
            case "Saturday": System.out.println("It is Saturday!");
            break;
            default: System.out.println("Thats not a day!");
            
        }
        // TODO code 1application logic here
    }
    
}
