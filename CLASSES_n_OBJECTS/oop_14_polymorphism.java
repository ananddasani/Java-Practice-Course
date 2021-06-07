//Program to demonstrate polymorphism in Java
package basic_oop_pakage;

//super class
class one {
    public int a;
    String Property;

    //Default Constructor
    public one() {
        //this constructor is needed for the sub class
        //manually defining because of the constructor with args is defined below
    }

    //constructor
    public one(int a, String prop) {
        this.a = a;
        this.Property = prop;
    }

    //Method of class one
    public void propertyDisplaying() {
        System.out.println("A = " + this.a + " & Property :: " + this.Property);
    }
}

//sub class
class two extends one {
    public int b;
    String Property;

    //here the default constructor will be needed in the super class ( one ) which is of no args.... :)
    public two(int b, String prop) {
        this.b = b;
        this.Property = prop;
    }

    //Method of class two
    @Override
    public void propertyDisplaying() {
        System.out.println("B = " + this.b + " & Property :: " + this.Property);
    }
}

public class oop_14_polymorphism {

    public static void main(String[] args) {

        //MainObject can refer to one class
        one obj1 = new one(10, "This is a object of :: one class");  // --> valid because one is also an object of Main class as it extends it.
        two obj2 = new two(10, "This is a object of :: two class");  // --> valid because one is also an object of Main class as it extends it.

        //calling super class display method by providing an instance of a subclass to a parameter of its super class type.
        obj1.propertyDisplaying();
        obj2.propertyDisplaying();
    }

    /**
     * Method to display the property of object passed
     *
     * @param mainObject
     */
    public static void displayObject(one mainObject) {
        mainObject.propertyDisplaying();
    }
}

/*
----------------------------- NOTE -----------------------

every instance of a subclass is also an instance of its superclass, but not vice versa

Therefore, you can always
pass an instance of a subclass to a parameter of its superclass type. like this

1 public class PolymorphismDemo {
2 // Main method
3 public static void main(String[] args) {
4 // Display circle and rectangle properties
5 displayObject(new CircleFromSimpleGeometricObject
6 (1, "red", false));
7 displayObject(new RectangleFromSimpleGeometricObject
8 (1, 1, "black", true));
9 }
10
11 // Display geometric object properties
12 public static void displayObject(SimpleGeometricObject object) {
13 System.out.println("Created on " + object.getDateCreated() +
14 ". Color is " + object.getColor());
15 }
16 }
 */
