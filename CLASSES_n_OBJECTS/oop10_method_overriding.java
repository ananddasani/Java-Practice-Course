//Program to demonstrate method overriding
package basic_oop_pakage;

class A {
    public int a;

    public void method1(){
        System.out.println("I am method 1 of class A");
    }

    public void method2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A {
    public int b;

    @Override //This annotation Protects us form assuming that we are overridden the method successfully , but actually not
    public void method2(){
        System.out.println("I am method 2 of class B");
    }

//    @Override --> here it will show the error
    public void method3(){
        System.out.println("I am method 3 of class B");
    }
}

public class oop10_method_overriding {

    public static void main(String[] args) {

        //calling method2 on object of A
        A a = new A();
        a.method2();

        //calling method2 on object of B (demonstrating overriding)
        B b = new B();
        b.method2();
    }
}
/*
override method means it must be defined in the subclass using the same signature and the same
return type as in its superclass.

A subclass inherits method form a super class sometimes it is necessary for the subclass to modify the
implementation of a method defined in the super class

this is referred to as overriding
 */