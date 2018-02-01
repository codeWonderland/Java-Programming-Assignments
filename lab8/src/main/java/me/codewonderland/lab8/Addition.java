package me.codewonderland.lab8;

/**
 * Created by aliceeaster on 3/23/17.
 */
public class Addition extends Equation {
    public char getOperator() {
        return '+';
    }

    public int computeAnswer() {
        return a + b;
    }
}
