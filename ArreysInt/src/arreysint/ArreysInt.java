
package arreysint;
import java.util.Scanner; 

public class ArreysInt {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int[] tal = new int [10];
        
        System.out.println("Tal har längden: " + tal.length);
        
        for (int i = 0; i < tal.length; i++ ){
            tal[i] = keyboard.nextInt();
        }
        for (int i = 0; i < tal.length; i++){
            System.out.println("tal[" +i+ "]="+tal[i]);
        }
        
        
        }
    
}
