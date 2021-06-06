/*
program to print palindrome numbers as many as user want
PRACTICE :: Basic Maths
 */
package basic_package;

import java.util.Scanner;

public class palindrome_number_range {

    public static void main(String[] args) {

        int count = 1;
        System.out.print("Enter how many palindrome number you want to see (excluding  single digits numbers) :: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 10; count <= n; i++) {
            if (palindrome(i)) {
                System.out.print(i + "    ");
                count++;
            }
        }
    }

    /**
     * this is a boolean returning method which will check the number passed as actual parameter form the main is palindrome or not
     * palindrome number means reversal of the number is same of the original number
     *
     * @param num will be checked
     * @return boolean value depending upon the number passed
     */
    public static boolean palindrome(int num) {

        int r, sum = 0, n = num;
        while (n != 0) { // reversing the number
            r = n % 10;
            sum = sum * 10 + r;
            n /= 10;
        }
        if (sum == num) // checking the reverse is same to original number
            return true;
        else
            return false;
    }
}
