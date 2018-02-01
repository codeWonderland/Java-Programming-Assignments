/**
 * Created by aliceeaster on 2/23/17.
 */
import static org.junit.Assert.*;

import me.codewonderland.lab5.Numbers;
import org.junit.Test;

public class NumbersTest {
    @Test
    public void testProduct() {
        Numbers calculator = new Numbers();

        assertEquals(calculator.product(0, 10000), 0);
        assertEquals(calculator.product(1, 9), 9);
        assertEquals(calculator.product(-4, -4), 16);
        assertEquals(calculator.product(11, 12), 132);
    }

    @Test
    public void testMaximum() {
        Numbers calculator = new Numbers();

        assertEquals(calculator.maximum(0, 7), 7);
        assertEquals(calculator.maximum(5, 3), 5);
        assertEquals(calculator.maximum(-2, -3), -2);
        assertEquals(calculator.maximum(4, 4), 4);
    }

    @Test
    public void testAreTenApart() {
        Numbers calculator = new Numbers();

        assertTrue(calculator.areTenApart(99, 109));
        assertTrue(calculator.areTenApart(5, -5));
        assertFalse(calculator.areTenApart(0, 1));
        assertFalse(calculator.areTenApart(10, 10));
    }
}
