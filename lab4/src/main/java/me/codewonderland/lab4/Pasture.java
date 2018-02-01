package me.codewonderland.lab4;

/**
 * Created by aliceeaster on 2/9/17.
 */
public class Pasture {

    int width;
    int length;

    int area() {
        // -----------------
        // Fix this code
        return width * length;
        // -----------------
    }

    int perimeter() {
        // -----------------
        // Fix this code
        return 2 * (width + length);
        // -----------------
    }

    float cost(float fencingPrice) {
        // -----------------
        // Fix this code
        return perimeter() * fencingPrice;
        // -----------------
    }

}
