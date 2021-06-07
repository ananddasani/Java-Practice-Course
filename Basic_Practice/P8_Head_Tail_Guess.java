/*
(Game: heads or tails)
Write a program that lets the user guess whether the flip of a coin results in heads or tails.
The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess and reports whether the guess is correct or incorrect.
 */
package basic_practice_package;

import java.util.Random;
import java.util.Scanner;

public class P8_Head_Tail_Guess {

    public static void main(String[] args) {

        Random rd = new Random();
        int rdNum = rd.nextInt(2);

        String coinResult; //comp. selection
        if (rdNum == 0)
            coinResult = "head";
        else
            coinResult = "tail";

        //prompt user to select head or tail
        System.out.println("1. Head\n2. Tail ");
        System.out.print("Try your luck with ? ");
        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();

        String guess; //user selection
        switch (choose) {
            case 1 -> guess = "head";
            case 2 -> guess = "tail";
            default -> guess = null;
        }

        //Report whether the guess is correct or not
        if (coinResult == guess)
            System.out.println("You win !!");
        else
            System.out.println("Bad Luck :(");
    }
}
