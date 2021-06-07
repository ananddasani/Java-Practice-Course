/*
Write a program that generate 6*6 two-dimensional matrix, filled with 0’s and 1’s , display the
matrix, check every raw and column have an odd number’s of 1’s.

 */
package Practical_package;

import java.util.Random;

public class PR_11_6X6_Matrix {

    public static void main(String[] args) {

        int row = 6, col = 6;

        //making an 2D array for matrix
        int[][] matrix = new int[row][col];

        //Method to generate matrix which is randomly filled with 0's and 1's
        fillMatrix(matrix);

        //display the matrix
        displayMatrix(matrix);

        //printing the row and column number which is having odd number of 1's
        printRowAndCol(matrix);

    }

    /**
     * Method to fill the matrix with random 1's and 0's
     *
     * @param matrix is the 2D array element for storing matrix
     */
    public static void fillMatrix(int[][] matrix) {

        Random rd = new Random(6);

        //travers the row
        for (int row = 0; row < matrix.length; row++) {

            //traverse the column
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rd.nextInt(2);
            }
        }
    }

    /**
     * Method to display the Matrix
     *
     * @param matrix is the 2D array element for storing matrix
     */
    public static void displayMatrix(int[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {

            for (int col = 0; col < matrix[row].length; col++) {

                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Method to print the row and column number which having odd number of 1's in it.
     *
     * @param matrix is the 2D array element for storing matrix
     */
    public static void printRowAndCol(int[][] matrix) {

        int rowCount = 0, colCount = 0;

        //counting the number of 1's for rows
        System.out.print("\nRows having odd number of 1's --> ");
        for (int row = 0; row < matrix.length; row++) {

            rowCount = 0; //each time resetting the count
            for (int col = 0; col < matrix[row].length; col++) {

                //increment rowCount if column having 1
                if (matrix[row][col] == 1)
                    rowCount++;
            }

            //if count is odd then print that row
            if (rowCount % 2 != 0)
                System.out.print((row + 1) + "\t");
        }

        //counting the number of 1's for rows
        System.out.print("\nColumns having odd number of 1's --> ");
        for (int row = 0; row < matrix.length; row++) {

            colCount = 0; //each time resetting the count
            for (int col = 0; col < matrix[row].length; col++) {

                //increment colCount if column having 1
                if (matrix[col][row] == 1) // see the order ---: col -> row
                    colCount++;
            }

            //if count is odd then print that column but print row as we have tricked the order
            if (colCount % 2 != 0)
                System.out.print((row + 1) + "\t");
        }
    }
}

/*
TEST CASE
1	0	1	0	1	1
0	0	0	1	1	0
1	1	1	0	0	1
1	1	1	1	1	1
0	0	1	1	1	0
1	1	0	1	1	0

Rows having odd number of 1's --> 5
Columns having odd number of 1's --> 2	5	6
 */
