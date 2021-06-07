package Tricky_package;//AIM :: to print 1 to 100 without using any number

public class printing_1_to_100_without_using_any_number {

    public static void main(String[] args) {

        // first method
        int one = 'A' / 'A'; //this is 1
        String str = ".........."; // length is 10 so (10 * 10 = 100)

        for (int i = one; i <= (str.length() * str.length()); i++)
            System.out.println(i);

        //second method
        //a = 97 , b = 98 , c = 99 , d =100
        for (int i = one; i <= 'd'; i++)
            System.out.println(i);
    }
}
