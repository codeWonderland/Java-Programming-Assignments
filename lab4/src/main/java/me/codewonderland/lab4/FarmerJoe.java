package me.codewonderland.lab4;

/**
 * Created by aliceeaster on 2/9/17.
 */

public class FarmerJoe {

    public static void main(String[] args) {
        Pasture pasture = new Pasture();
        pasture.width = 35;
        pasture.length = 24;

        System.out.format("We need to buy fencing for a %d ft x %d ft pasture\n",
                pasture.width,
                pasture.length);

        System.out.format("The pasture has an area of %d sq ft and a perimeter of %d ft\n",
                pasture.area(),
                pasture.perimeter());

        float fencingPrice = 23.99f;

        System.out.format("The fencing costs $%.2f per foot\n", fencingPrice);

        System.out.format("At that price, it will cost $%.2f to build the fence\n",
                pasture.cost(fencingPrice));

    }
}
