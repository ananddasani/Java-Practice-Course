package basic_package;/*

program to print star pattern like this \
*
 *  *
 *  *  *
 *  *  *  *
 *  *  *  *  *

PRACTICE :: Nested Loops
 */

import java.util.Scanner;

public class star_pattern_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of  rows :: ");
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
