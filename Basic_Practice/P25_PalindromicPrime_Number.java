/*
(Palindromic prime) A palindromic prime is a prime number and also palindromic. For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display 10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929
...
 */
package basic_practice_package;

public class P25_PalindromicPrime_Number {

    public static void main(String[] args) {

        System.out.println("Here are first 100 Palindromic Prime Numbers :: ");

        for (int i = 1, count = 0; count < 100; i++) {
            if (isPrime(i) && isPalindrome(i)) {
                System.out.printf("%10d\t", i);
                count++;

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

    public static boolean isPalindrome(int num) {
        int revNum = reverse(num);
        return num == revNum;
    }

    public static int reverse(int n) {
        int sum = 0;
        while (n != 0) {
            sum = (sum * 10) + (n % 10);
            n /= 10;
        }
        return sum;
    }
}
