/*
PROGRAM TO SWAP TO NUMBERS USING EXTRA VARIABLE AND WITHOUT USING EXTRA VARIABLE
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class swap {

    public static void main(String[] args) {

        System.out.print("Enter two numbers to basic_package.swap :: ");

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("\t\tvalue before basic_package.swap (from main)");
        System.out.println("a = " + n1 + "\tb = " + n2);
        SWAP(n1, n2);

    }

    public static void SWAP(int a, int b) {
        // swapped using bit magic
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        // swapped using third variable
//        int temp = a;
//        a = b;
//        b = temp;

        // swapped using no third variable
//        a = a + b;
//        b = a - b;
//        a = a - b;

        System.out.println("\t\tvalue after basic_package.swap (from basic_package.swap)");
        System.out.println("a = " + a + "\tb = " + b);
    }
}