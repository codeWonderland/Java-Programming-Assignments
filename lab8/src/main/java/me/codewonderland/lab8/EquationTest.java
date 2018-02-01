package me.codewonderland.lab8;

/**
 * Created by aliceeaster on 3/23/17.
 */
public class EquationTest {

    public static void main(String args[]) {
        Addition add = new Addition();
        add.a = 53443;
        add.b = 48392;

        add.print();

        System.out.println();

        Subtraction sub = new Subtraction();
        sub.a = 3210;
        sub.b = 4321;

        sub.print();

        System.out.println();

        Multiplication mult = new Multiplication();
        mult.a = 6233;
        mult.b = 482;

        mult.print();
    }
}
