/*
(Decimal to hex) Write a program that prompts the user to enter an integer between
0 and 15 and displays its corresponding hex number.
 */
package basic_practice_package;

import java.util.Scanner;

public class P9_Decimal_to_Hex {

    public static void main(String[] args) {

        System.out.print("Enter an integer to get it's corresponding hex :: ");
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();

//        //for 1 to 15 only
//            int hex = decimal % 16;
//            if (hex > 9) {
//                //replace 10 with A , 11 with B and so on till 15 with F
//                String hexa = null;
//                switch (hex) {
//                    case 10 -> hexa = "A";
//                    case 11 -> hexa = "B";
//                    case 12 -> hexa = "C";
//                    case 13 -> hexa = "D";
//                    case 14 -> hexa = "E";
//                    case 15 -> hexa = "F";
//                }
//                System.out.println(hexa);
//            } else
//                System.out.println(hex);


        //for 1 to ...
        //                                  METHOD 1

        //char array to store haxa decimal number
        char[] hexaDecimal = new char[100];

        //counter for hexadecimal array
        int i = 0;
        while (decimal != 0) {
            //store the reminder
            int rem = decimal % 16;

            //if temp less then 10 , then simply add 48
            if (rem < 10)
                hexaDecimal[i] = (char)(rem + 48);
            else // else add 55
                hexaDecimal[i] = (char)(rem + 55);
            i++;
            decimal /= 16;
        }

        //print array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(hexaDecimal[j]);



        //                                  METHOD 2

//        int rem;
//        String hex="";
//        char hexchars[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
//        while(decimal>0)
//        {
//            rem=decimal%16;
//            hex=hexchars[rem]+hex;
//            decimal=decimal/16;
//        }
//        System.out.println(hex);
    }
}