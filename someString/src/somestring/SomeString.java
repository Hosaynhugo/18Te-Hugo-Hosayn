
package somestring;

import java.util.Scanner;

public class SomeString {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String someString = new String();
        System.out.println("Skriv något: ");
        System.out.println();
        someString = keyboard.nextLine();
        String newString = new String();

        newString = someString.toString();
        System.out.println("Inskriven text: " + newString);
        System.out.println();

        newString = someString.toLowerCase();
        System.out.println("Små bokstäver: " + newString);
        System.out.println();

        newString = someString.toUpperCase();
        System.out.println("Stora bokstäver: " + newString);
        System.out.println();

        for (int i = 0; i < newString.length(); i++) {
            System.out.println(newString.charAt(i));
        }
        String reverse = "";

        for (int j = someString.length() - 1; j >= 0; j--) {
            reverse = reverse + someString.charAt(j);

        }
        System.out.println();

        System.out.println("Text reversed: " + reverse);
        System.out.println();

        System.out.println("antal bokstäver: " + newString.length());
        System.out.println();
        
        

    }

}
