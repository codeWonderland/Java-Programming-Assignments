package me.codewonderland.lab7;

/**
 * Created by aliceeaster on 3/7/17.
 */
public class Rectangle implements Shape {
    private double mLength, mWidth;

    public Rectangle(double mLength, double mWidth) {
        this.mLength = mLength;
        this.mWidth = mWidth;
    }

    public double area() {
        return mLength * mWidth;
    }

    public double perimeter() {
        return 2 * (mLength + mWidth);
    }
}
