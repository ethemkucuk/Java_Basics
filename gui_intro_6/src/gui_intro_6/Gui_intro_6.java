/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_intro_6;
import javax.swing.JOptionPane;

/**
 *
 * @author Monster
 */
public class Gui_intro_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age "));
        JOptionPane.showMessageDialog(null, "You are " +age+ " years old");
        
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "You are " + height + "cm Tall");
        
                
        // TODO code application logic here
    }
    
}
