/*
QUESTION :: WAP that returns 0 or 1 randomly.
 */
package basic_package;

import java.util.Random;

public class return_0_1_randomly {

    public static void main(String[] args) {

        System.out.println("Returned :: " + return0and1());
    }

    /**
     * Method will return 0 or 1 randomly
     * @return 0 or 1 randomly
     */
    public static int return0and1() {

        Random rd = new Random();
        return rd.nextInt(2);
    }
}
