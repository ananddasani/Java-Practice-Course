/*
program to demonstrate method overloading
PRACTICE :: Methods overloading in Java
 */
package basic_package;

public class overloading_method {

    public static void main(String[] args) {

        // this shows the method overloading.
        System.out.println("SUM OF 1 + 2 IS     :: " + sum(1, 2)); // method basic_package.sum will be called having 2 argument
        System.out.println("SUM OF 1 + 2 + 3 IS :: " + sum(1, 2, 3)); // basic_package.sum method having 3 argument will be called
        // method overloading happen when there is a method with same name and with same return value but different number of argument
    }

    /**
     * when there will be 2 argument will be passed by the caller function this method will be called
     *
     * @param n1 for storing value of number 1
     * @param n2 for storing value of number 2
     * @return the basic_package.sum of 2 numbers passed as a argument
     */
    public static int sum(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * when there will be  3 argument will be passed by the caller function this method will be called
     *
     * @param n1 for storing value of number 1
     * @param n2 for storing value of number 2
     * @param n3 for storing value of number 3
     * @return ths basic_package.sum of 3 numbers passed as a argument
     */
    public static int sum(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }
}
