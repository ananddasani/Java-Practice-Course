/*
Write a program that creates a Random object with seed 1000 and displays the first 100 random
integers between 1 and 49 using the NextInt (49) method.
 */
package Practical_package;

import java.util.Random;

public class PR_12_Random_number_display {

    public static void main(String[] args) {

        //Random object is created with seed 1000
        Random rd = new Random(1000);


        //displaying 100 random numbers
        for (int i = 0; i < 100; i++) {

            //displaying in row of 10 numbers
            if (i % 10 == 0)
                System.out.println();

            //displaying the random number generated and bounded between 1 and 49
            System.out.print(rd.nextInt(49) + "\t");
        }
    }
}

/*
TEST CASE

40	1	17	0	46	46	4	33	9	40
25	13	17	29	30	31	42	35	48	40
11	13	10	0	38	9	0	10	35	10
14	26	34	35	31	43	47	35	2	33
16	48	45	43	5	29	1	35	0	25
28	42	25	2	33	30	18	27	4	28
31	35	9	13	33	12	18	36	39	7
17	31	21	26	47	39	11	40	11	26
48	26	27	32	19	30	26	4	7	40
9	41	8	37	3	34	10	36	4	21
 */