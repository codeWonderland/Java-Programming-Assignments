import static org.junit.Assert.*;

import me.codewonderland.lab9.Measures;
import org.junit.Test;

public class MeasuresTest {

    @Test
    public void testPoundsToKilograms() {
        assertEquals(11.3398, Measures.poundsToKilograms(25), 0.001);
    }

    @Test
    public void testKilogramsToPounds() {
        assertEquals(55.1156, Measures.kilogramsToPounds(25), 0.001);
    }

    @Test
    public void testKilometersToMiles() {
        assertEquals(15.5343, Measures.kilometersToMiles(25), 0.001);
    }

    @Test
    public void testMilesToKilometers() {
        assertEquals(40.2336, Measures.milesToKilometers(25), 0.001);
    }

    @Test
    public void testLitersToGallons() {
        assertEquals(6.6043, Measures.litersToGallons(25), 0.001);
    }

    @Test
    public void testGallonsToLiters() {
        assertEquals(94.6353, Measures.gallonsToLiters(25), 0.001);
    }

}