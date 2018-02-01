package com.codewonderland.carddealer;

/**
 * Created by aliceeaster on 1/27/17.
 */
public class cardDealer {

    public static void main(String args[]) {
        System.out.println("Good day to you!.  Here is your hand of five cards:");

        String[] suits = {"spades", "hearts", "clubs", "diamonds"};

        for (int i = 0; i < 5; i++) {
            // Instantiate a new Card object
            Card card = new Card();

            // Give the card a random number
            card.number = ((int) (Math.random() * 12) + 1);

            // Give the card a random suit
            card.suit = suits[((int) (Math.random() * 4))];

            // Deal the card
            card.deal();
        }

    }


}
