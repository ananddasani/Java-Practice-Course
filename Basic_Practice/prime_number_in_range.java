/*
Program to print first 50 prime number
Prime number is a number which is only divisible by itself and by 1 (exactly 2 divisible )
PRACTICE :: Basic Maths
 */
package basic_package;

public class prime_number_in_range {

    public static void main(String[] args) {

//        int number = 3;

        for (int i = 1, primeCount = 0; primeCount != 50; i++) {

            boolean printed = false;
            if (isPrime(i)) {
                System.out.print(i + "\t");
                primeCount++;
                printed = true;
            }

            //printing in block of 10
            if (primeCount % 10 == 0 && printed)
                System.out.println();
        }
    }

    /**
     * Method to check whether the number is prime or not
     *
     * @param num is the variable to store number
     * @return ture if number is prime else false
     */
    public static boolean isPrime(int num) {

        for (int i = 2; i <= Math.sqrt(num); i++) {

            if (num % i == 0)
                return false; // if any other divisible fount except 1 and itself means not a prime number
        }
        return true;
    }
}

/*
TEST CASE

1	2	3	5	7	11	13	17	19	23
29	31	37	41	43	47	53	59	61	67
71	73	79	83	89	97	101	103	107	109
113	127	131	137	139	149	151	157	163	167
173	179	181	191	193	197	199	211	223	227

 */