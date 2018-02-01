package me.codewonderland.magiceightball;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to magic 8 ball.");
        System.out.println("Ask a question and press enter to shake.");
        System.out.println();

        boolean done = false;
        String answer;
        String output[] = {"Don't count on it", "My reply is no", "My sources say yes", "Outlook not so good",
                            "Very doubtful", "Brandon's Programming looks better than your chances",
                            "You probably won't die", "Looks good fam"};

        while(!done) {
            Scanner input = new Scanner(System.in);
            answer = input.nextLine();

            if(answer.equals("quit")) {
                System.out.println();
                done = true;
            } else {
                System.out.println();
                System.out.println("[shake shake shake]");
                System.out.println(output[(int) (Math.random() * output.length)]);
                System.out.println();
                System.out.println("Ask another question, or type \"quit\".");
                System.out.println();
            }
        }

        System.out.println("See Ya!");
    }
}


