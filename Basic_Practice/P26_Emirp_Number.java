/*
(Emirp)
An emirp (prime spelled backward) is a non palindromic prime number whose reversal is also a prime.
For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps.
Write a program that displays the first 100 emirps.
Display 10 numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389
 */
package basic_practice_package;

public class P26_Emirp_Number {

    public static void main(String[] args) {

        System.out.println("Here are first 100 Emirp Numbers :: ");

        int revPrime;
        for (int i = 1, count = 0; count < 100; i++) {

            if (isPrime(i) && (!isPalindrome(i))) {
                //if it is prime then , check if it's reverse if also prime ?
                revPrime = reverseNumber(i); // reversing the prime number we got

                if (isPrime(revPrime)) {
                    System.out.printf("%10d ", i);
                    count++;
                }

                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0)
                return false; // if any other divisible fount except 1 and itself means not a prime number
        }
        return true;
    }

    public static int reverseNumber(int n) {
        int sum = 0;
        while (n != 0) {
            sum = (sum * 10) + (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int num) {
        int revNum = reverseNumber(num);
        return num == revNum;
    }
}
