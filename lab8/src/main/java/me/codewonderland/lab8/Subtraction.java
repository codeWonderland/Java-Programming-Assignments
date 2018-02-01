package me.codewonderland.lab8;

/**
 * Created by aliceeaster on 3/23/17.
 */
public class Subtraction extends Equation {
    public char getOperator() {
        return '\u2212';
    }

    public int computeAnswer() {
        return a - b;
    }
}
