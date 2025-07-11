package Inheritance;

import java.awt.*;

class Shapes{

    public double calculateArea(){
        System.out.println("Area of this shape is :");
        return 0.0;
    }

    public double calculatePerimeter(){
        System.out.println("The perimeter is : ");
        return 0.0;
    }



}

class circle extends Shapes{
    double radius;
    circle(double radius){
        this.radius = radius;
    }
   @Override
    public double calculateArea(){
        double area = 3.141516 * radius* radius;
        System.out.println("Area of this circle  is :");
        return area;
    }
     @Override
    public double calculatePerimeter(){
        double perimeter = 2*3.1415 * radius;
        System.out.println("The perimeter of circle is : ");
        return perimeter;
    }

}

class square extends Shapes{
    double side;
    square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        double area = side * side;
        System.out.println("Area of this square is :");
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = 4*side;
        System.out.println("The perimeter is : ");
        return perimeter;
    }
}

class Rectangle extends Shapes
{
    double length;
    double breadth;
    Rectangle(double length , double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea(){
        double area = length * breadth;
        System.out.println("Area of this shape  Rectangle is :");
        return area;
    }
    @Override
    public double calculatePerimeter(){
        double perimeter = 2 * (length + breadth);
        System.out.println("The perimeter is : ");
        return perimeter;
    }

}
public class OverridingOne {
    public static void main(String[] args) {
        Shapes s = new circle(5);
        System.out.println(s.calculateArea());
        System.out.println(s.calculatePerimeter());
    }
}
