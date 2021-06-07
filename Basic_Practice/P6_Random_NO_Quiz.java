/*
Program to generate three single-digit integers and prompt the user to
enter the sum of these three integers.
 */
package basic_practice_package;

import java.util.Random;
import java.util.Scanner;

public class P6_Random_NO_Quiz {

    public static void main(String[] args) {

        Random rd = new Random();

        //generating 3 single digit integers
        int n1 = rd.nextInt(10);
        int n3 = rd.nextInt(10);
        int n2 = rd.nextInt(10);

        int correctAns = n1 + n2 + n3;
        Scanner sc = new Scanner(System.in);
        System.out.printf("\n%d + %d + %d = ", n1, n2, n3);
        int userAns = sc.nextInt();
        while (userAns != correctAns) {
            System.out.println("Try again :(");
            System.out.printf("\n%d + %d + %d = ", n1, n2, n3);
            userAns = sc.nextInt();
        }
        System.out.println("Yes !! you summed it correct :)");
    }
}
