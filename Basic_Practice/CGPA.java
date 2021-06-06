/*
QUESTION :: calculate CGPA of a student
PRACTICE :: Basic Math problem
 */
package basic_package;
import java.util.Scanner;

public class CGPA {

    public static void main(String[] args) {

        System.out.print("\nenter the marks of 3 subject: ");

        Scanner sc = new Scanner(System.in);
        float maths = sc.nextFloat(); // getting the marks of maths
        float phy = sc.nextFloat(); // getting the marks of physics
        float chem = sc.nextFloat(); // getting the marks of chemistry

        float CGPA = (maths + phy + chem) / 30.0F; //  dividing by 30 instead of 3 , to get basic_package.CGPA which is generally calculated out of 10
        System.out.format("\nbasic_package.CGPA = %f",CGPA);
    }
}
