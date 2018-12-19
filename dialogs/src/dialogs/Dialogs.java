/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialogs;

import javax.swing.JOptionPane;

/**
 *
 * @author hugo.hosaynhasan
 */
public class Dialogs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String first_name;
        first_name = JOptionPane.showInputDialog("First Name ");

        String family_name;
        family_name = JOptionPane.showInputDialog("Family Name ");

        String full_name;
        full_name = "You are " + first_name + family_name;
        
       

        System.exit(0);
        S // TODO code application logic here
    }

}
