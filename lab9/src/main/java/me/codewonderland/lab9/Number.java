package me.codewonderland.lab9;


/**
 * Created by aliceeaster on 3/30/17.
 */
public class Number {

    public static final int DOZEN = 12;
    public static final int GROSS = DOZEN * DOZEN;
    public static final int BAKERS_DOZEN = 13;
    public static final int SCORE = 20;

    public static String gettysburgIfy(int n) {
        return (n / SCORE) + " score and " + (n % SCORE);
    }

    private Number() {
        // This ensures you cannot create a Number object
    }


}

