package basic_oop_pakage;//program to demonstrate constructors and overloading of constructors

class RECTANGLE {
    // using data field encapsulation (Making the data field private)
    private int length;
    private int height;

    //default constructor
    public RECTANGLE() {
        System.out.println("I am in default constructor because parameters is not given :(");
        length = 100;
        height = 100;
    }

    //constructor with parameters (overloading of constructor)
    public RECTANGLE(int l, int h) {
        length = l;
        height = h;
        System.out.println("I am in overloaded constructor because parameters is given :)");
    }

    //getter as this properties is private to the class
    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}

public class oop2_constructors_and_overloading {

    public static void main(String[] args) {

        RECTANGLE R = new RECTANGLE(); // the default constructor will be called
        System.out.println("Length without specifying is :: " + R.getLength());
        System.out.println("Height without specifying is :: " + R.getHeight());

        RECTANGLE REC = new RECTANGLE(1, 1); // overloaded constructor will be called
        System.out.println("Length by giving parameter is :: " + REC.getLength());
        System.out.println("Height by giving parameter is :: " + REC.getHeight());
    }
}
