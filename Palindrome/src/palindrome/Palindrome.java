
package palindrome;

import java.util.Scanner;

public class Palindrome {

   
    public static void main(String[] args) {
        
        String original, reverse = "";
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Skriv ett ord och se om det är en palindrom");
        original = keyboard.nextLine();
        
        int length = original.length();
        
        for ( int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);
        
        if (original.equals(reverse))
            System.out.println("Ordet är en palindrome.");
        else
            System.out.println(" Ordet är inte en palindrome.");
        
    }
    
}
