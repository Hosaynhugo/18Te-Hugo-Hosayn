package calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        
        
        System.out.println("Hej och välkommen till miniräknaren. ");
        System.out.print("Skriv in ett tal: ");
        Scanner keyboard = new Scanner (System.in);
        double talEtt = keyboard.nextDouble();
        
        System.out.print("Skriv in ett tal till: ");
        double talTva = keyboard.nextDouble();
        
        System.out.print("Vilket räknesätt? ");
        keyboard.nextLine();
        String raknesatt = keyboard.nextLine();
        
        char calc = raknesatt.charAt(0);
        double resultat = 0;
        
        switch (calc) {
            case '+' :
                resultat = talEtt + talTva;
                break;
            case '-':
                resultat = talEtt + talTva;
                break;
            case '*':
                resultat = talEtt + talTva;
                break;
            case '/':
                resultat = talEtt / talTva;
                break;
        }
                
       
                 
         
        
         System.out.println(resultat);
       
        
        
        }
  
        
        

      
        
        
    }
    

