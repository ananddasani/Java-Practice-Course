/*
QUESTION :: the multiplication table
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class multiplication_table {

    public static void main(String[] args) {

        System.out.print("\nEnter the number you want the multiplication table :: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //printing in forward manner
        for (int i = 1; i <= 10; i++)
            System.out.printf("%d X %d = %d\n", n, i, (n * i));

        System.out.print("\n");

        // printing in reverse manner
        for (int i = 10; i >= 1; i--)
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
    }
}
