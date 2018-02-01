package com.codewonderland.carddealer;

/**
 * Created by aliceeaster on 1/27/17.
 */
public class Card {
    int number;
    String suit;

    void deal() {
        System.out.println("Here is the " + this.number + " of " + this.suit);
    }
}
