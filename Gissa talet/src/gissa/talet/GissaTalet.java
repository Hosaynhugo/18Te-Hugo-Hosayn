package gissa.talet;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GissaTalet {

    private static int countPlaytime;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        int guess = 0;
        int countPlaytime = 0;
        int highscore = 0;
     
        String playAgain = new String();
        Scanner keyboard = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "Välkommen till spelet \"Gissa ett tal!\"");
        do {
            String maxGuessString = JOptionPane.showInputDialog(null, "Skriv in högsta tal att gissa: ");
            int maxGuess = Integer.parseInt(maxGuessString);

            int answer = (int) (Math.random() * maxGuess) + 1;
            int countGuesses = 0;
            

            do {
                System.out.print("Gissningar: ");
                guess = keyboard.nextInt();
                countGuesses++;
                if (guess < answer) {
                    System.out.println("För litet!");
                } else if (guess > answer) {
                    System.out.println("För stort!");
                }
                if (guess != answer) {
                    System.out.println("Fel! Gissa igen!");
                }
            
                countPlaytime++;
                
              if(highscore < countGuesses); {
                  highscore = countGuesses;
                  
                
              }
           
            
            
            } while (answer != guess);
            
            

            System.out.println("Hurra!");
            System.out.println("Det tog " + countGuesses + " gissningar.");

            //fråga spelaren om han vill spela igen
            System.out.print("Vill du spela igen? (j/n) ");

            keyboard.nextLine();
            playAgain = keyboard.nextLine();

        } while (playAgain.equals("j"));

        System.out.println("Du har kört " + countPlaytime + " gånger.");
        System.out.println("Highscore " + highscore + "");
        System.out.println("Hej då! ):");

    }
}
