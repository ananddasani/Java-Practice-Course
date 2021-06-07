/*
program to calculate the occurrence of each letters in the array
PRACTICE :: Array , Random character generation , Counting
 */
package basic_package;

public class count_letters {

    public static void main(String[] args) {

        int n = 101;
        char[] ch = new char[n];

        //initializing basic_package.array with random characters
        for (int i = 0; i < 101; i++) {
            ch[i] = (char) ('a' + Math.random() * ('z' - 'a') + 1);
        }

        System.out.println("\n\t\tArray is :: ");
        for (int i = 0; i < ch.length; i++) {
            if (i % 10 == 0)
                System.out.println();
            else
                System.out.print(ch[i] + "    ");
        }

        int[] chNum = new int[26];
        for (int i = 0; i < n; i++) // incrementing the occurred element's position
            chNum[ch[i] - 'a']++;

        //displaying the counted basic_package.array
        for (int i = 0; i < chNum.length; i++) {
            if (i % 10 == 0)
                System.out.println();
            System.out.print((char) ('a' + i) + " = " + chNum[i] + "  ");
        }
    }
}