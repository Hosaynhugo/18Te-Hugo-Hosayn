package stensaxpase;

import java.util.Scanner;
import java.util.Random;

public class Stensaxpase {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String playAgain = new String();
        Random generator = new Random();
        String spelare = new String();
        String dator = "";
        String svar;
        int datorInt;
        String ROCK = "ROCK";
        String SCISSOR = "SCISSOR";
        String PAPER = "PAPER";

        do {
            datorInt = generator.nextInt(3) + 1;

            if (datorInt == 1) 
                dator = "ROCK";
             else if (datorInt == 2) 
                dator = "SCISSOR";
             else if (datorInt == 3) 
                dator = "PAPER";

            System.out.print("Rock, paper or scissor?: ");
            spelare = keyboard.nextLine();
            spelare = spelare.toUpperCase();
System.out.println("The computer choose: " + dator);
            if (spelare.equals(dator)) {
                System.out.println("Draw, you picked the same object!");}
             else if (spelare.equals("ROCK")){ 
                if (dator.equals("SCISSOR")) 
                    System.out.println("Rock wins over Scissor, you win!");
                 else if (dator.equals("PAPER")) 
                    System.out.println("Paper wins over Rock, you lost!");}
             else if (spelare.equals("SCISSOR")){ 
                if (dator.equals("PAPER")) 
                    System.out.println("Scissor wins over Paper, you win!");
                 else if (dator.equals("ROCK")) 
                    System.out.println("Rock wins over Scissor, you lost!");}

             else if (spelare.equals("PAPER")) {
                if (dator.equals("ROCK")) 
                    System.out.println("Paper wins over Rock, you win!");
                 else if (dator.equals("SCISSOR")) 
                    System.out.println("Scissor wins over Paper, you lost!");}
                System.out.println("Do you wanna play again, y/n? ");
            playAgain = keyboard.nextLine();
            } while (playAgain.equals("y"));
        System.out.println("Goodbye");
    }
}

