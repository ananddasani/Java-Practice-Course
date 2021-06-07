/*
18 Even/Odd Counter
Write a program with a method named isEven that accepts an int argument. The method
should return true if the argument is even, or false otherwise. The program’s main method
should use a loop to generate 100 random integers. It should use the isEven method to
determine whether each random number is even, or odd. When the loop is finished, the
program should display the number of even numbers that were generated, and the number
of odd numbers.

 */
package basic_practice_package;

import java.util.Random;

public class P18_Even_Odd_Counter {

    public static void main(String[] args) {

        Random rd = new Random();
        int randNumber, even = 0, odd = 0;

        //generating 100 random number
        for (int i = 0; i < 100; i++) {
            randNumber = rd.nextInt();

            if (isEven(randNumber))
                even++;
            else
                odd++;
        }
        System.out.println("Even :: " + even + " Odd :: " + odd);
    }

    /**
     * Method to check whether the number is even or not
     *
     * @param n is the number which is to checked
     * @return ture if number is even
     */
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
