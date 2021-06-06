/*
program to print square and cube table
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class square_cube {

    public static void main(String[] args) {

        System.out.print("Enter the limit for table of square and cube starting from 1 :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking the sentinel value to terminate the loop

        System.out.print("\nSQUARE\t\t\tCUBE");
        for (int i = 1; i <= n; i++)
            System.out.printf("\n%d\t\t\t\t%d", i * i, i * i * i); // printing the loop the table
    }
}
