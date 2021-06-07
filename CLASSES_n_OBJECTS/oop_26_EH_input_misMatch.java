/*
QUESTION

Take Integer input form the user
if input miss match prompt user to try again by inputting integer value

(Use the InputMismatchException) to tackle this situation
 */
package basic_oop_pakage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class oop_26_EH_input_misMatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueInput = true;
        do {
            try {
                System.out.print("Enter Integer value :: ");
                int n = sc.nextInt();

                //display the result
                System.out.println("\nYou entered :: " + n);

                //terminate the loop
                continueInput = false;

            } catch (InputMismatchException e) {
                System.out.println("\nEnter integer value only");

                //discard the input
                sc.nextLine();
            }
        } while (continueInput);
    }
}
