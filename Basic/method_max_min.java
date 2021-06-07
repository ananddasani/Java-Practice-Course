/*
PRACTICE :: Methods basics
 */
package basic_package;

import java.util.Scanner;

public class method_max_min {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers :: "); // taking 3 numbers from user
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println("\nMAX = " + max(n1, n2, n3));
        System.out.println("\nMIN = " + min(n1, n2, n3));
    }

    public static int max(int n1, int n2, int n3) {
        int max;

        if (n1 > n2 && n1 > n3)
            max = n1;
        else if (n2 > n3)
            max = n2;
        else
            max = n3;

        return max;
    }

    public static int min(int n1, int n2, int n3) {
        int min;

        if (n1 < n2 && n1 < n3)
            min = n1;
        else if (n2 < n3)
            min = n2;
        else
            min = n3;

        return min;
    }
}
