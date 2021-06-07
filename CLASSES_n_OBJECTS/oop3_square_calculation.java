package basic_oop_pakage;//problem :: create a class practice.square with a method to initialize its side , calculate area and perimeter

//this is the custom class
class oop3_square {
    private int side;

//                      METHOD 1
    //this is default constructor
    public oop3_square() {
        System.out.println("Inside the default constructor");
    }

    //this is the overloaded constructor
    public oop3_square(int s) {
        System.out.println("Inside the overloaded constructor with side :: " + s);
        side = s;
    }

//                      METHOD 2
    //getters and setters
    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    //Method for calculating the area
    public int area() {
        return side * side;
    }

    //Method for calculating the perimeter
    public int perimeter() {
        return 4 * side;
    }
}

public class oop3_square_calculation {

    public static void main(String[] args) {


        //              METHOD 1 (USING CONSTRUCTOR)
//        practice.square sq = new practice.square(1); // call the overloaded constructor
//
//        System.out.println("Area of practice.square is :: " + sq.area());
//        System.out.println("perimeter of practice.square is :: " + sq.perimeter());


        //              METHOD 2 (USING GETTERS AND SETTERS)
        oop3_square sq = new oop3_square();

        sq.setSide(4);
        System.out.println("Side of practice.square is :: " + sq.getSide());

        System.out.println("Area of practice.square is :: " + sq.area());
        System.out.println("Perimeter of practice.square is :: " + sq.perimeter());
    }
}
