package me.codewonderland.bigdice;

import java.util.Scanner;

/**
 * Created by aliceeaster on 4/4/17.
 */
public class DiceGame {
    public static void main(String[] args) {

        boolean done = false;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Let's play Big Dice.  We will each roll one die, then I'll give\n" +
                    "you the option to reroll.  Whoever has the highest number on \n" +
                    "their die wins.");

            System.out.println();

            System.out.println();

            Dice playerDice = new Dice();
            Dice computerDice = new Dice();

            playerDice.playerRoll();
            computerDice.computerRoll();

            if (playerDice.roll > computerDice.roll) {
                System.out.println("You win!\n\n");
            } else if (computerDice.roll > playerDice.roll) {
                System.out.println("I win!\n\n");
            } else {
                System.out.println("It's a tie!\n\n");
            }

            System.out.println("Play again? (Yes/No)");

            String cont;

            cont = input.nextLine();

            if (!(cont.equals("Yes") || cont.equals("YES") || cont.equals("yes"))) {
                done = true;
            }
        } while(!done);
    }
}
