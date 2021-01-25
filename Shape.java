package Homework1;
import java.lang.*;
import java.math.*;
public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public Shape(String color) {
        this.color = color;
    }

    public Shape(boolean filled) {
        this.filled = filled;
    }

    protected Shape() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public boolean isFilled() {
        return false;
    }
}