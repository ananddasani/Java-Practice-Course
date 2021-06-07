/*
Assume a vehicle plate number consists of three uppercase letters followed by four digits. Write a
program to generate a plate number.
 */
package Practical_package;

import java.util.Random;

public class PR_7_Number_Plate {

    public static void main(String[] args) {

        int num = (int) (Math.random() * 10000); // generating 4 digit random number

        if (num < 1000) // if randomly generated number is less than 4 digit
            num += 1000;

//                                              METHOD 1.
//        int randomCharacter1 = (int) (Math.random() * 26); // generating random number between 0.0 to 23.4
//        int randomCharacter2 = (int) (Math.random() * 26);
//        int randomCharacter3 = (int) (Math.random() * 26);
//
//        // A = 65 , B = 66 ... Z = 91
//        System.out.printf("new number is -> %c%c%c %d", 65 + randomCharacter1, 65 + randomCharacter2,65 + randomCharacter3, num);

//                                              METHOD 2.
        Random r = new Random();
//       int randomNumber = r.nextInt(); // −2,147,483,648 and +2,147,483,647

//        int rc1 = r.nextInt(26); // 0 and 26
//        int rc2 = r.nextInt(26);
//        int rc3 = r.nextInt(26);
//        System.out.printf("%c%c%c %d" , (65 + rc1) , (65 + rc2),(65 + rc3), num);

//                                                METHOD 3.
        System.out.println("New number plate is -> " + getRandomChar('A', 'Z') + getRandomChar('A', 'Z') + getRandomChar('A', 'Z') + ' ' + num);
    }

    /**
     * method will generate random character between specified range
     *
     * @param ch1 for storing lower limit
     * @param ch2 for storing upper limit
     * @return random character between specified range given in parameters
     */
    public static char getRandomChar(char ch1, char ch2) {

        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1)); // generating && returning random character between ch1 and ch2
    }
}
