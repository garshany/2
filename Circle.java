package Homework1;
import java.lang.*;
import java.math.*;
public class Circle extends Shape{
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString() {
        return "Circle{" +  "radius=" + radius + ", color='" + color + '\'' + '}';
    }
}