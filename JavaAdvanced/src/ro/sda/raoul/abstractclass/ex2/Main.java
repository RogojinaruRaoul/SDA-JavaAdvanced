package ro.sda.raoul.abstractclass.ex2;

/**
 * a. Write an abstract class Shape
 * – Data members: numSides
 * – Constructor: initialize numSides
 * – Concrete method: get method for numSides
 * – Abstract methods: getArea(), getPerimeter()
 * b. Write a concrete subclass Rectangle
 * – Data members: width, height
 * c. Write a concrete subclass Triangle
 * – Data members: width, height
 * In another class, write a main method to define a Rectangle and a Triangle.
 */
public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(12, 5);
        Shape triangle = new Triangle(6, 5);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
