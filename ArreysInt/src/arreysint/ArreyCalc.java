
package arreysint;

import java.util.Scanner;
public class ArreyCalc {
    
    
     public static void main(String[] args) {
         Scanner keyboard = new Scanner(System.in);
         
         int[] tal=new int[10];
         
         
         //läs in 10 tal
          for (int i = 0; i < tal.length; i++ ){
            tal[i] = keyboard.nextInt();
        }
          
          //summera talen
          int summa = 0;
          for(int i=0; i<tal.length; i++){
              summa+= tal[i];
          }
          System.out.println("Summan är " + summa);
          //Ta reda på största talet.
          int storstaTalet = Integer.MIN_VALUE;
          for (int i=0; i<tal.length; i++){
         if (tal[i] > storstaTalet) {
             storstaTalet = tal[i];
         }
     }
          System.out.println("Största talet: " +storstaTalet);
          
          
          // ta reda på minsta talet
          
          
          
          //räkna ut medelvärdet
          
         
     }
    
}
