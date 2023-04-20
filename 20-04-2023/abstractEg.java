package PracticeCodes;

//Shape abstract class
abstract class Shape 
{
 // Abstract method to calculate area
 public abstract double calculateArea();
}

//Circle subclass
class Circle extends Shape 
{
 double radius;

 public Circle(double radius) 
 {
     this.radius = radius;
 }

 // Override method to calculate area of Circle
 @Override
 public double calculateArea()
 {
     return 3.14 * radius * radius;
 }
}

//Rectangle subclass
class Rectangle extends Shape 
{
  double length;
 double width;

 public Rectangle(double length, double width) 
 {
     this.length = length;
     this.width = width;
 }

 // Override method to calculate area of Rectangle
 @Override
 public double calculateArea() 
 {
     return length * width;
 }
}

//Main class to test the implementation
public class abstractEg 
{
 public static void main(String[] args)
 {
     // Create Circle object and calculate area
     Circle circle = new Circle(3);
     double circleArea = circle.calculateArea();
     System.out.println("Area of Circle : " + circleArea);
     System.out.println();

     // Create Rectangle object and calculate area
     Rectangle rectangle = new Rectangle(10, 30);
     double rectangleArea = rectangle.calculateArea();
     System.out.println("Area of Rectangle : " + rectangleArea);
 }
}
