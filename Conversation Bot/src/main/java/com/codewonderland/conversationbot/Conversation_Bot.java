package com.codewonderland.conversationbot;

import java.util.Scanner;

/**
 * Created by aliceeaster on 1/26/17.
 */
public class Conversation_Bot {
    public static void main(String args[]) {

        int age = (int) (Math.random() * 100) + 1;

        Scanner input = new Scanner(System.in);

        System.out.print("What yo name be: ");

        String name = input.nextLine();

        boolean continueLoop = true;
        int upper = 100, lower = 1;

        while (continueLoop) {
            System.out.println(name + " you are " + age + "!");
            System.out.print("Was I right, low, or high: ");

            String userInput = input.nextLine();

            System.out.println("");

            if (userInput.equals("low")) {
                lower = age + 1;
            } else if (userInput.equals("high")) {
                upper = age - 1;
            } else {
                System.out.println("First Time!");
                continueLoop = false;
            }

            if (continueLoop) {
                age = (int) (Math.random() * (upper - lower) + (lower + 1));
            }

        }
    }
}
