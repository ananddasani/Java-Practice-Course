/*
(Display matrix of 0s and 1s)
Write a method that displays an n-by-n matrix using the following header:
                        public static void printMatrix(int n)
Each element is 0 or 1, which is generated randomly.
Write a test program that prompts the user to enter n and displays an n-by-n matrix
 */
package basic_practice_package;

import java.util.Random;
import java.util.Scanner;

public class P23_Display_Matrix {

    public static void main(String[] args) {

        System.out.print("Enter Number of Rows in Matrix :: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.print("Enter Number of Cols. in the Matrix :: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        fillMatrix(matrix);

        printMatrix(matrix);
    }

    public static void fillMatrix(int[][] matrix) {
        Random rd = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                matrix[i][j] = rd.nextInt(2);
        }
    }

    public static void printMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
