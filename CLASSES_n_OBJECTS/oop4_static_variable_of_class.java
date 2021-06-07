package basic_oop_pakage;/*
                                            program to prove ::
static variable shares the same memory of class unlike the instances of the class that stores the different value of different object

[static variable stores the same value for every object of same class]
 */

//this is the custom class
class staticDemo {

    //for counting the objects created
    private static int staticCount = 0;

    // default constructor
    public staticDemo() {
        System.out.println("Inside the default constructor ");
        staticCount++; // incrementing the count everytime the new objects created
        // to be proved that every object count the continue number rather than starting form 0
    }

    //getter method for getting the count of staticCount
    public int getStaticCount() {
        return staticCount;
    }
}

public class oop4_static_variable_of_class {

    public static void main(String[] args) {

        staticDemo ob1 = new staticDemo();
        staticDemo ob2 = new staticDemo();
        staticDemo ob3 = new staticDemo();
        staticDemo ob4 = new staticDemo();

        System.out.println(ob1.getStaticCount() + " instances of the class 'practice.staticDemo' were created :)");
        // Although the program calls the getInstanceCount method from object1, the same value
        //would be returned from any of the objects.
        // because all the 3 objects shares the same memory location

        //if will be remove STATIC than answer will 1 for every objects
        // as the counting will be NOT continued , every time will be stared with 0
    }
}
