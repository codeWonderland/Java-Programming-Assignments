package me.codewonderland.lab8;

/**
 * Created by aliceeaster on 3/23/17.
 */
public class Multiplication extends Equation {
    public char getOperator() {
        return '\u00D7';
    }

    public int computeAnswer() {
        return a * b;
    }
}
