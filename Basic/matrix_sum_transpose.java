/*
program will take a matrix from the user and do basic_package.sum , transpose of it
PRACTICE :: Matrix
 */
package basic_package;

import java.util.Scanner;

public class matrix_sum_transpose {

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

        displayMatrix(matrix, row, col);//displaying 2D basic_package.array

        System.out.println("\nSum of this matrix is : " + sumMatrix(matrix)); // basic_package.sum of the element of the matrix

        displayMatrix(matrix, row, col); // display the original matrix
        transposeMatrix(matrix); // display the transpose of matrix
    }

    /**
     * this method will basic_package.sum all the element of the 2D basic_package.array which is passed as the actual argument form the calling method
     *
     * @param arr for storing the value of the basic_package.array elements
     * @return the basic_package.sum of the all the element present in the basic_package.array
     */
    public static int sumMatrix(int[][] arr) {

        int sum = 0;
        //using enhanced for loop
        for (int[] row : arr) // traverse all rows
            for (int col : row) // traverse all element of rows 1 , 2, and so on...
                sum += col;

        //using traditional for loop
//        for (int i = 0; i < arr.length; i++) // form 0 to n - 1
//            for (int j = 0; j < arr[i].length; j++) // form 0 to n - 1 in row 1 then in row 2 and so on...
//                basic_package.sum += arr[i][j];
        return sum;
    }

    /**
     * method will print matrix in reverse order (transpose)
     *
     * @param arr is the name of 2D basic_package.array
     */
    public static void transposeMatrix(int[][] arr) {
        System.out.println("\n\t\tTRANSPOSE OF " + arr.length + " X " + arr[0].length + " MATRIX IS :\n");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[j][i] + "    ");
            System.out.println();
        }
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