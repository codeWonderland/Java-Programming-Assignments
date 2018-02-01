package me.codewonderland.lab7;

/**
 * Created by aliceeaster on 3/7/17.
 */
import static org.junit.Assert.*;

import org.junit.Test;

public class TestShape {

    @Test
    public void testArea() {
        Shape[] shapes = generateShapes();
        double[] areas = {200, 15, 64, .25, 3.14, 12.57};

        for (int i = 0; i < shapes.length; i++) {
            assertEquals(areas[i], shapes[i].area(), 0.01);
        }
    }

    @Test
    public void testPerimeter() {
        Shape[] shapes = generateShapes();
        double[] perimeters = {60, 61, 32, 2, 6.28, 12.57};

        for (int i = 0; i < shapes.length; i++) {
            assertEquals(perimeters[i], shapes[i].perimeter(), 0.01);
        }
    }

    private Shape[] generateShapes() {
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(.5f, 30);
        Square t1 = new Square(8);
        Square t2 = new Square(.5f);
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);

        Shape[] shapes = {r1, r2, t1, t2, c1, c2};

        return shapes;
    }

}
