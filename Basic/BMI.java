/*
program to calculate the BODY MASS INDEX
PRACTICE :: if-else block in java
 */
package basic_package;
import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("\nenter your weight in KG :: ");
        float weight = sc.nextFloat();

        System.out.print("\nenter your height in M:: ");
        float hig = sc.nextFloat();

        float BMI = (weight / (hig * hig));
        System.out.println(BMI);

        if (BMI < 18.5)
            System.out.println("underweight");

        else if (BMI < 25)
            System.out.println("normal");

        else if (BMI < 30)
            System.out.println("overweight");
        else
            System.out.println("obese");
    }
}
