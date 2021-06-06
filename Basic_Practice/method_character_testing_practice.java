/*
QUESTION

write a program that ask user to enter the costumer number
and check whether that is a valid costumer number or not ?

the proper format should be --> ABC1234
 */
package basic_package;

import java.util.Scanner;

public class method_character_testing_practice {

    public static void main(String[] args) {

        System.out.print("Enter your costumer number :: ");
        Scanner sc = new Scanner(System.in);
        String cstNumber = sc.next();

        if (isValid(cstNumber))
            System.out.println("that is a valid costumer number :)");
        else
            System.out.println("Invalid !! The correct format should be --> ABC1234 :)");
    }

    /**
     * Method will check the correct formatting of customer number and return boolean value as per correctness
     *
     * @param cNo is the customer number which is to be checked
     * @return ture if format is correct else return false
     */
    public static boolean isValid(String cNo) {
        boolean goodSoFar = true; //flag for validation of customer number
        int i = 0; //control variable

        //Test the completeness of number
        if (cNo.length() != 7) {
            System.out.println("customer number is Too short :(");
            return false;
        }

        //test the first 3 characters
        while (goodSoFar && i < 3) {
            if (!Character.isLetter(cNo.charAt(i)))
                goodSoFar = false;
            i++;
        }

        //test the last 4 characters for digit
        while (goodSoFar && i < 7) {
            if (!Character.isDigit(cNo.charAt(i)))
                goodSoFar = false;
            i++;
        }
        return goodSoFar;
    }
}
