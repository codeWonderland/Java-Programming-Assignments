package me.codewonderland.lab6;

/**
 * Created by aliceeaster on 3/2/17.
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class TestShape {

    @Test
    public void test() {
        Rectangle r1 = new Rectangle();
        r1.height = 10;
        r1.width = 20;

        Rectangle r2 = new Rectangle();
        r2.height = .5f;
        r2.width = 30;

        Triangle t1 = new Triangle();
        t1.height = 2;
        t1.width = 8;

        Triangle t2 = new Triangle();
        t2.height = 1;
        t2.width = .5f;

        Shape[] shapes = {r1, r2, t1, t2};
        float[] areas = {200, 15, 8, .25f};

        for (int i = 0; i < shapes.length; i++) {
            assertEquals(areas[i], shapes[i].area(), 0.01f);
        }
    }

}
