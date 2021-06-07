/*
program to check the inputted character is vowel or constant or symbol
PRACTICE :: enhanced switch case
 */
package basic_package;
import java.util.Scanner;

public class vowel_check {

    public static void main(String[] args) {

        System.out.print("\nEnter any character to check it is an vowel or not :: ");

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        // traditional switch case
//        switch (ch) {
//            case 'a':
//            case 'A':
//            case 'e':
//            case 'E':
//            case 'i':
//            case 'I':
//            case 'o':
//            case 'O':
//            case 'u':
//            case 'U':
//                System.out.println(ch + " is  an vowel :)");
//                break;
//            default:
//                if (ch >= 48 && ch <= 58)
//                    System.out.println(ch + " is an integer constant :)");
//                else
//                    System.out.println(ch + " is a special symbol :(");
//        }

        //enhanced switch case
        switch (ch) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> System.out.println(ch + " is a VOWEL :)");
            default -> {
                if (ch >= 48 && ch <= 58)
                    System.out.println(ch + " is an integer CONSTANT :)");
                else
                    System.out.println(ch + " is a special SYMBOL :(");
            }
        }
    }
}
