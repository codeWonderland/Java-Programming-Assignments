package me.codewonderland.lab7;

/**
 * Created by aliceeaster on 3/7/17.
 */
public class Circle implements Shape {
    private double mRadius;

    public Circle(double radius) {
        this.mRadius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(mRadius, 2);
    }

    public double perimeter() {
        return 2 * Math.PI * mRadius;
    }
}
