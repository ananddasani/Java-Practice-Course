/*
Describe abstract class called Shape which has three subclasses say
                            Triangle, Rectangle, Circle.
Define one method area() in the abstract class and override this area() in these three subclasses
to calculate for specific object i.e. area() of Triangle subclass should calculate area of triangle etc.
Same for Rectangle and Circle
 */
package basic_oop_pakage;

import java.util.Scanner;

//This is an abstract class
abstract class Shape {

    //This is an abstract Method
    public abstract double area();
}

class Triangle extends Shape {
    double base, height;

    //Constructor for Triangle class
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (this.base * this.height) / 2;
    }
}

class Rectangle1 extends Shape {
    double length, width;

    //Constructor for Rectangle1 class
    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    //Constructor for Circle class
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * this.radius * this.radius);
    }
}

public class oop13_abstract_class_practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give the following dimensions to calculate area of different Shapes ");

        System.out.print("Base :: ");
        double base = sc.nextDouble();
        System.out.print("\nHeight :: ");
        double height = sc.nextDouble();
        System.out.print("\nLength :: ");
        double length = sc.nextDouble();
        System.out.print("\nWidth :: ");
        double width = sc.nextDouble();
        System.out.print("\nRadius :: ");
        double radius = sc.nextDouble();

        Triangle tr = new Triangle(base, height);
        Rectangle1 rt = new Rectangle1(length, width);
        Circle cr = new Circle(radius);

        System.out.println("Area of Triangle is :: " + tr.area());
        System.out.println("Area of Rectangle is :: " + rt.area());
        System.out.println("Area of Circle is :: " + cr.area());
    }
}
