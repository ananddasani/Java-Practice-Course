/*
QUESTION ::  print the reverse of the digit given by the user
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class reverse_number {

    public static void main(String[] args) {

        System.out.print("\nEnter the number to reverse :: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0, r, temp = n;
        while (n != 0) {
            sum = ( sum * 10) + n % 10; //first , multiplying basic_package.sum by 10 (so number keeps on reversing) && then adding the last digit of the number
            n /= 10; // deleting the last number of the number
        }
        System.out.println("\nReverse of " + temp + " is -> " + sum);
    }
}
