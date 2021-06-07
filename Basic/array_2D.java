/*
program to Demonstrate Multi-Dimension Arrays in Java
PRACTICE :: 2D Array (Declaring , Assigning , ... ) in the form of Matrix
 */
package basic_package;

import java.util.Scanner;

public class array_2D {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in matrix :: ");
        int row = sc.nextInt();

        System.out.print("Enter the number of columns in matrix :: ");
        int col = sc.nextInt();

        //declaring 2D basic_package.array of size of user want
        int[][] matrix = new int[row][col];

        // taking input form user and storing at appropriate position in 2D basic_package.array
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        displayMatrix(matrix, row, col); // display the original matrix
    }

    /**
     * program to display 2D basic_package.array passed in argument form the caller method
     *
     * @param arr is name of the basic_package.array
     * @param row for storing the number of rows
     * @param col for storing the number of columns
     */
    public static void displayMatrix(int[][] arr, int row, int col) {

        System.out.println("\n\t\t" + row + " X " + col + " MATRIX IS :\n");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                System.out.print(arr[i][j] + "    ");
            System.out.println();
        }
    }
}
