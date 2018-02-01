package me.codewonderland.lab9;

import java.util.Scanner;

public class StaticClass {
    public static void main(String[] args) {
        System.out.println("A dozen is " + Number.DOZEN);
        System.out.println("A gross is " + Number.GROSS);
        System.out.println("A baker's dozen is " + Number.BAKERS_DOZEN);
        System.out.println();
        System.out.println();

        int answer = 0;

        while (answer < 1776) {
            System.out.println("What year is it: ");

            Scanner input = new Scanner(System.in);
            answer = input.nextInt();

            System.out.println();
        }

        System.out.println(Number.gettysburgIfy(answer - 1776) + " years ago, our fathers brought forth on this\n" +
                "continent, a new nation, conceived in Liberty, and\n" +
                "dedicated to the proposition that all men are created equal.");
    }

}
