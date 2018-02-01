package me.codewonderland.lab9;

/**
 * Created by aliceeaster on 3/30/17.
 */
public class Measures {

    public static double poundsToKilograms(int value) {
        return value * 0.453592;
    }

    public static double kilogramsToPounds(int value) {
        return value * 2.20462;
    }

    public static double kilometersToMiles(int value) {
        return value * 0.621371;
    }

    public static double milesToKilometers(int value) {
        return value * 1.60934;
    }

    public static double litersToGallons(int value) {
        return value * 0.264172;
    }

    public static double gallonsToLiters(int value) {
        return value * 3.78541;
    }
}