/*
program to take input from user and check the division is possible or not , if possible then show the answer
PRACTICE :: basic if-else
 */
package basic_package;
import java.util.Scanner;

public class divisible_possibility {

    public static void main(String[] args) {

        System.out.print("Enter two numbers :: ");

        Scanner sc = new Scanner(System.in);
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();

        if (n2 == 0)
            System.out.println(n1 + " is not divisible by " + n2);
        else
            System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
    }
}


