/*
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your
weight in kilograms and dividing by the square of your height in meters. Write a program that
prompts the user to enter a weight in pounds and height in inches and displays the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
 */
package Practical_package;

import java.util.Scanner;

public class PR_4_BMI_Calculator {

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
