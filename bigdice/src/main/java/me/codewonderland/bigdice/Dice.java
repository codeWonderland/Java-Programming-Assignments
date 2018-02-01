package me.codewonderland.bigdice;

import java.util.Scanner;

/**
 * Created by aliceeaster on 4/4/17.
 */
public class Dice {
    public int roll;
    public boolean alreadyRolled = false;
    public String cont;

    public int getRoll() {
        return roll;
    }

    public void playerRoll() {
        Scanner input = new Scanner(System.in);
        System.out.println("Hit RETURN to continue");
        input.nextLine();
        System.out.println();
        System.out.println("[SHAKE SHAKE SHAKE]");
        System.out.println();
        System.out.println("Here is your role");

        roll = (int)(Math.random() * 6) + 1;

        displayRoll(roll);

        if(alreadyRolled == false) {
            alreadyRolled = true;

            System.out.println("Would you like to reroll (Yes/No)?");
            cont = input.nextLine();

            if(cont.equals("Yes") || cont.equals("YES") || cont.equals("yes")) {
                playerRoll();
            }
        }
    }

    public void computerRoll() {
        roll = (int)(Math.random() * 6) + 1;
        System.out.println("[SHAKE SHAKE SHAKE]");
        System.out.println();
        System.out.println("Here is my role");
        displayRoll(roll);
    }

    public void displayRoll(int roll) {
        switch(roll) {
            case 1:
                System.out.println("+-----+\n" +
                        "|     |\n" +
                        "|  *  |\n" +
                        "|     |\n" +
                        "+-----+\n\n");
                break;
            case 2:
                System.out.println("+-----+\n" +
                        "|     |\n" +
                        "| * * |\n" +
                        "|     |\n" +
                        "+-----+\n\n");
                break;
            case 3:
                System.out.println("+-----+\n" +
                        "| *   |\n" +
                        "|  *  |\n" +
                        "|   * |\n" +
                        "+-----+\n\n");
                break;
            case 4:
                System.out.println("+-----+\n" +
                        "| * * |\n" +
                        "|     |\n" +
                        "| * * |\n" +
                        "+-----+\n\n");
                break;
            case 5:
                System.out.println("+-----+\n" +
                        "| * * |\n" +
                        "|  *  |\n" +
                        "| * * |\n" +
                        "+-----+\n\n");
                break;
            default:
                System.out.println("+-----+\n" +
                        "| * * |\n" +
                        "| * * |\n" +
                        "| * * |\n" +
                        "+-----+\n\n");
                break;
        }
    }
}
