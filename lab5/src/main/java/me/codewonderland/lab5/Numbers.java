package me.codewonderland.lab5;

/**
 * Created by aliceeaster on 2/23/17.
 */
// Do not use Math.* for any of these methods
public class Numbers {

    public int product(int a, int b) {
        // TODO: Should return the product of the two numbers
        return a * b;
    }

    public int maximum(int a, int b) {
        // TODO: Should return the maximum (larger) of the two numbers.
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public boolean areTenApart(int a, int b) {
        // TODO: Should return true if the numbers are ten apart, and false otherwise.
        if (a - b == 10) {
            return true;
        } else if (b - a == 10) {
            return true;
        } else {
            return false;
        }
    }

}
