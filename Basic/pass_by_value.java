/*
program to demonstrate that pass by value will not affect the main method's value
PRACTICE :: Basic Maths
 */
package basic_package;
import java.util.Scanner;

public class pass_by_value {

    public static void main(String[] args) {

        System.out.print("Enter two numbers to basic_package.swap :: ");

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("\t\tvalue before basic_package.swap (from main)");
        System.out.println("a = " + n1 + "\tb = " + n2);
        swap(n1, n2);

    }

    public static void swap(int a, int b) {
        // swapped using bit magic
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("\t\tvalue after basic_package.swap (from basic_package.swap)");
        System.out.println("a = " + a + "\tb = " + b);
    }
}
