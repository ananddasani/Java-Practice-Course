/*
Program to demonstrate StringBuilder class of java
PRACTICE :: StringBuilder class
 */
package basic_package;

public class stringBuilder_class {

    public static void main(String[] args) {

        //this constructor will be of length --> (str.len + 16)
        StringBuilder s0 = new StringBuilder("This is a String builder object\n");
        System.out.println(s0);

        //The append method
        //SYNTAX :: object.append(item);
        StringBuilder s1 = new StringBuilder();
        s1.append("we sold ");
        s1.append(12);
        s1.append(" Apples for $");
        s1.append(12.3);
        //display the object's content
        System.out.println(s1);


        //The insert method
        // SYNTAX :: object.insert(start, item);
        StringBuilder s2 = new StringBuilder("New City\n");
        s2.insert(4, "York ");
        System.out.println(s2);

        //inserting character array
        char[] cArray = {'2', '0', ' '};
        StringBuilder s3 = new StringBuilder("In july we sold cars\n");
        s3.insert(16, cArray);
        System.out.println(s3);


        //The replace method
        //SYNTAX :: object.replace(start, end, str)

        StringBuilder s4 = new StringBuilder("We moved from India to US");
        s4.replace(14, 19, "Dubai");
        System.out.println(s4);


        //The delete , deleteCharAt , setChar methods
        //StringBuilder delete(int start, int end)
        //StringBuilder deleteCharAt(int position)
        //void setCharAt(int position,char ch)

        StringBuilder s5 = new StringBuilder("I ate 100 BlueBerries :)");
        System.out.println(s5);

        //The delete method will delete the substring that is in the region
        s5.delete(10, 14); //deleting blue
        System.out.println(s5);

        //The deleteCharAt method will delete a particular char at the specified position
        s5.deleteCharAt(7); // making 100 --> 10
        System.out.println(s5);

        //The setCharAt will set the given char at the specified location in the string
        s5.setCharAt(6, '5'); // making 10 --> 50
        System.out.println(s5);


        //The toString method will convert the String Builder object to a regular String object
        StringBuilder strb = new StringBuilder("This is a test ");
        String str = strb.toString();
//        str.append(10); --> produce error !!
    }
}
