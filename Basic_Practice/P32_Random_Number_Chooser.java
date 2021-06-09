/*
(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)
 */
package basic_practice_package;

import java.util.Random;

public class P32_Random_Number_Chooser {

    public static void main(String[] args) {

        //passing the excluding numbers that i didn't want randomly
        System.out.println(getRandom(1, 2, 8, 9, 11, 15, 23, 45, 26, 28, 29, 31, 34, 36, 40, 43, 48, 49, 53));
    }

    /**
     * Method will return randomly generated number but not that numbers which are passed as argument
     *
     * @param numbers is the int array to hold the numbers that are to be excluded
     * @return the excluded random number
     */
    public static int getRandom(int... numbers) {
        Random rd = new Random();

        int rNum; //for holding the random numbers
        boolean isExcluded; // accumulator for the loop
        do {
            isExcluded = false; // initially don't repeat the loop once again

            //generating random numbers
            rNum = rd.nextInt(55);

            //if the Random number is to be excluded then don't return that instead continue loop 1 time
            for (int ele : numbers) {
                if (rNum == ele)
                    isExcluded = true;
            }
        } while (isExcluded);
        return rNum;
    }
}
