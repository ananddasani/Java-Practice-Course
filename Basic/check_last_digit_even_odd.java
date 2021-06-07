/*
QUESTION :: program to check the last digit of the given number is even or odd
PRACTICE :: Math practice
 */
package basic_package;
import java.util.Scanner;

public class check_last_digit_even_odd {

    public static void main(String[] args) {

        System.out.print("Enter any number to check it's last digit is even or odd :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking number from User
        int reminder = n;

        if ((reminder %= 10) == 0) // separating the last digit of number and checking whether it is even or odd
            System.out.println(n + " -> " + reminder + " is even !");
        else
            System.out.println(n + " -> " + reminder + " is odd !");
    }
}
