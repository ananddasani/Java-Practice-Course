package basic_package;/*
program to print star pattern like this
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *
            *  *  *  *  *

PRACTICE :: Nested Loops
 */

import java.util.Scanner;

public class star_pattern_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter number of rows :: ");
        int row = sc.nextInt();
        System.out.print("\nEnter the number of columns :: ");
        int col = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}
