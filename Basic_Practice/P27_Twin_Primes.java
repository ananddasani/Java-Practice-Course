/*
(Twin primes)
Twin primes are a pair of prime numbers that differ by 2.
For example, 3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
Write a program to find all twin primes less than 1,000. Display the output as follows:
(3, 5)
(5, 7)
 */
package basic_practice_package;

import java.util.ArrayList;

public class P27_Twin_Primes {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i <= 1000; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        //getting the twin pair
        for (int i = 0; i < list.size() - 1; i++) {
            if (((list.get(i + 1)) - (list.get(i)) == 2)) {
                System.out.printf("(%d, %d)\n", list.get(i), list.get(i + 1));
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
}
