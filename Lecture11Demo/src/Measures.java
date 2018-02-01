
public class Measures {
    
    public static final double KILOGRAMS_TO_POUNDS = 2.20462;
    public static final double POUNDS_TO_KILOGRAMS = 0.453592;
    public static final double KILOMETERS_TO_MILES = 0.621371;
    public static final double MILES_TO_KILOMETERS = 1.60934;
    public static final double LITERS_TO_GALLONS = 0.264172;
    public static final double GALLONS_TO_LITERS = 3.78541;
    
    public static double poundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    public static double kilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }
    
    public static double kilometersToMiles(double kilometers) {
        return kilometers * KILOMETERS_TO_MILES;
    }
    
    public static double milesToKilometers(double miles) {
        return miles * MILES_TO_KILOMETERS;
    }
    
    public static double litersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }
    
    public static double gallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

}
