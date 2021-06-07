/*
Program to demonstrate the super keyword in java while inheritance
 */
package basic_oop_pakage;

class superClass {
    private int a;

    //Constructor #1
    public superClass() {
        System.out.println("Inside the super Class constructor 'NO ARGS'");
    }

    //Constructor #2
    public superClass(int a) {
        System.out.println("Inside the super Class constructor 'WITH ARG :: " + a);
    }
}

//extending the super class to use the super keyword
class subClass extends superClass {

    //Constructor #1
    public subClass() {
        super(4);
        System.out.println("Inside the sub class constructor 'NO ARGS'");
    }
}

public class oop8_super_keyword_in_java {

    public static void main(String[] args) {

        subClass sub = new subClass();
    }
}
