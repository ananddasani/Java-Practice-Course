/*
QUESTION :: generate 2 random numbers
PRACTICE :: generating Random digits

 */
package basic_package;
import java.util.Scanner;

public class random_numbers {

    public static void main(String[] args) {

        // by default Math.random return the double value such that 0.0 <= d < 1.0
        // so type cast into the required datatype
        int n1 = (int) (Math.random() * 10); // multiplying by 10 to get numbers between 0 and 9 , instead of 0.0 and 0.9
        int n2 = (int) (Math.random() * 10);
        // two random single digit number is generated

        if (n1 < n2) { // if first number generated is smaller than second then swapping , because answer must be in +ve
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        System.out.print("\n" + n1 + " - " + n2 + " = ");
        Scanner sc = new Scanner(System.in);
        int ans = sc.nextInt(); // getting answer from the user

        System.out.println("\n" + n1 + " - " + n2 + " = " + ans + " is " + (n1 - n2 == ans)); // checking directly the answer (boolean)
    }
}
