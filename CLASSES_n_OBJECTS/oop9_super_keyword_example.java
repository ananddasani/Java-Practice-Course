/*
Program to demonstrate the super keyword in the Rectangle and cube class
 */
package basic_oop_pakage;

import java.util.Scanner;

class Rectangle {
    protected int length;
    protected int width;

    //Constructor for assigning the length and width of the Rectangle
    public Rectangle(int len, int wid) {
        this.length = len;
        this.width = wid;
    }

    //The super class method
    public void greet(){
        System.out.println("Hi i am method of super class :0");
    }
}

class Cube extends Rectangle {
    protected int height;

    //Constructor to set length , width and height of the Cube
    public Cube(int len, int wid, int hei) {

        //constructor of Rectangle will take care of assigning len and wid;
        super(len, wid);

        // SYNTAX ::    super.MethodNameOfSuperClass
        super.greet(); // this is a syntax to call a super class method using super keyword :)

        this.height = hei; //Assigning the height of Cube manually
    }

    //accessors for height
    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
}

public class oop9_super_keyword_example {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n\t\tEnter the following dimensions of Cube");

        System.out.print("Length :: ");
        int length = sc.nextInt();
        System.out.println("Width :: ");
        int width = sc.nextInt();
        System.out.println("Height :: ");
        int height = sc.nextInt();

        //Passing the user given dimensions to the constructor
        Cube cubeObject = new Cube(length, width, height);

        //doing some maths
        System.out.println("Dimensions of Cube is \nLength :: " + cubeObject.getLength() +
                " \nWidth :: " + cubeObject.getWidth() + "\nHeight :: " + cubeObject.getHeight());
    }
}
