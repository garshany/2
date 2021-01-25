package Homework1;
import java.lang.*;
import java.math.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length ) {
        this.width = 10.0;
        this.length = 0.0;
        this.filled = false;
        this.color = "purple";
    }

    public Rectangle() {
        this.width = width;
        this.length = length;
        this.filled = false;
        this.color = "purple";
    }


    public double getWidth() {

        return width;
    }

    public void setWidth(double width) {

        this.width = width;
    }

    public double getLength() {

        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return
                width*length;
    }

    public double getPerimeter() {
        return
                2*(width+length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }
}