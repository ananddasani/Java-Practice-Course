/*
program will take 2 matrix from user ,sum both matrix and multiply it
PRACTICE :: Matrix
 */
package basic_package;

import java.util.Scanner;

public class matrix_addition_multiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows and columns in Matrix A :: ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.print("Enter the number of rows and columns in Matrix A :: ");
        int p = sc.nextInt();
        int q = sc.nextInt();


        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[p][q];

        System.out.println("\n\t\tMatrix 1 : ");
        matrix1 = getMatrix(matrix1);
        System.out.println("\n\t\tMatrix 2 : ");
        matrix2 = getMatrix(matrix2);

        System.out.println("\n\t\tMatrix 1 : ");
        displayMatrix(matrix1);
        System.out.println("\n\t\tMatrix 2 : ");
        displayMatrix(matrix2);

        System.out.println("\nAddition of this two matrix is : ");
        int[][] addResult = new int[m][n];
//        addResult = addMatrix(matrix1, matrix2);
        displayMatrix(addResult);

        System.out.println("\nMultiplication of this two matrix is : ");
        int[][] multiplyResult = new int[m][n];
//        multiplyResult = multiplyMatrix(matrix1 , matrix2);
        displayMatrix(multiplyResult);

    }
/*
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {

    }

    public static int[][] multiplyMatrix(int[][] matrix1, int[][] matrix2){

    }
*/
    public static int[][] getMatrix(int[][] matrix) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + (i + 1) + "][" + (j + 1) + "] = ");
                matrix[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        return matrix;
    }

    public static void displayMatrix(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + "    ");

            System.out.println();
        }
    }
}