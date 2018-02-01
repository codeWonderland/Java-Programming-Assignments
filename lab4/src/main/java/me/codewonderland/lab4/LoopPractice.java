package me.codewonderland.lab4;

import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("On a scale of 1 to 10, how happy are you?");

        int numLas = input.nextInt();

        System.out.println();

        System.out.print("Tra ");

        for (int i = 0; i < numLas; i++){
            System.out.print("la ");
        }
    }
}
