/*
program to check whether the given number is armstrong number or not
PRACTICE :: Improving Maths Skills
 */
package basic_package;

import java.util.Scanner;

public class armstrong_number {

    public static void main(String[] args) {

        System.out.print("Enter the number to check whether it is ARMSTRONG NUMBER or not :: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // taking the number form the user

        if (armstrong(n)) // calling the armstrong function which will check and return boolean value
            System.out.println(n + " is an ARMSTRONG NUMBER");
        else
            System.out.println(n + " is not an ARMSTRONG NUMBER");
    }

    /**
     * this is the value returning method for checking the given number is armstrong or not
     * armstrong number means basic_package.sum of cube of individual digit of number
     *
     * @param num which is to be checked
     * @return boolean value depending on the number passed as actual argument from the main function
     */
    public static boolean armstrong(int num) {
        int r, n = num, sum = 0;
        while (n != 0) {
            r = n % 10; // getting the individual number
            sum = sum + r * r * r; // cubing it and adding to the basic_package.sum variable
            n = n / 10; // removing the last number which is already added
        }
        if (sum == num) //basic_package.sum must be same as the number given
            return true;
        else
            return false;
    }
}
