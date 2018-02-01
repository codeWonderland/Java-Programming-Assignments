package me.codewonderland.lab8;

/**
 * Created by aliceeaster on 3/23/17.
 */
public abstract class Equation {
    int a;
    int b;

    public abstract char getOperator();
    public abstract int computeAnswer();

    public void print() {
        int aWidth = numberOfDigits(a);
        int bWidth = numberOfDigits(b);
        int cWidth = numberOfDigits(computeAnswer());
        int width = Math.max(aWidth, Math.max(bWidth, cWidth)) + 1;

        System.out.format(" %"  + width + "d\n", a);
        System.out.format("%c%" + width + "d\n", getOperator(), b);
        for (int i = 0; i < width + 1; i++) {
            System.out.print("\u2500");
        }
        System.out.println();
        System.out.format(" %"  + width + "d\n", computeAnswer());
    }

    private static int numberOfDigits(int n) {
        return (n != 0 ? (int) Math.log10(Math.abs(n)) + 1 : 1) + (n < 0 ? 1 : 0);
    }
}
