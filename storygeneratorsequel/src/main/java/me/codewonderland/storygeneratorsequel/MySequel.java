package me.codewonderland.storygeneratorsequel;

import java.util.Scanner;

@SuppressWarnings("resource")
public class MySequel {

    Person hero;
    Person friend;
    Person wizard;
    Person villain;
    String mysticalObject;

    public static void main(String[] args) {
        MySequel mySequel = new MySequel();

        mySequel.createStory();

        mySequel.introduction();
        mySequel.body();
        mySequel.conclusion();
    }

    void createStory() {
        Scanner userInput = new Scanner(System.in);

        // Only put code between these lines
        // --------------
        System.out.println("I need some help creating this story.");
        System.out.println("What is the hero's name?");
        hero = new Person();
        hero.setName(userInput.nextLine());
        hero.randomTrait();
        hero.randomWeapon();

        System.out.println("What is the friend's name?");
        friend = new Person();
        friend.setName(userInput.nextLine());
        friend.randomTrait();
        friend.randomWeapon();

        System.out.println("What is the wizard's name?");
        wizard = new Person();
        wizard.setName(userInput.nextLine());
        wizard.randomTrait();
        wizard.randomWeapon();

        System.out.println("What is the villain's name?");
        villain = new Person();
        villain.setName(userInput.nextLine());
        villain.randomTrait();
        villain.randomWeapon();

        System.out.println("What is your mystical object of choice?");
        mysticalObject = userInput.nextLine();
        // --------------
    }

    void introduction() {
        // Only put code between these lines
        // --------------
        System.out.format("Once upon a time there was a %s hero named %s who had a %s friend named %s", hero.getUniqueTrait(), hero.getName(), friend.getUniqueTrait(), friend.getName());
        // --------------
    }

    void body() {
        // Only put code between these lines
        // --------------
        System.out.println();
        System.out.format("One day, %s and %s came across a %s wizard named %s",friend.getName(), hero.getName(), wizard.getUniqueTrait(), wizard.getName());
        System.out.println();
        System.out.format("%s held their %s up to %s's throat and told them to help them", wizard.getName(), wizard.getWeapon(), friend.getName());
        System.out.println();
        System.out.format("%s pulled out their %s and yelled at %s to back away. As they did this %s pulled out their %s", hero.getName(), hero.getWeapon(), wizard.getName(), friend.getName(), friend.getWeapon());
        System.out.println();
        System.out.format("%s told the two adventurers that there was a %s villain named %s", wizard.getName(), villain.getUniqueTrait(), villain.getName());
        System.out.println();
        System.out.format("The wizard gave %s a %s and warned them about the villan's %s", hero.getName(), mysticalObject, villain.getWeapon());
        // --------------
    }

    void conclusion() {
        // Only put code between these lines
        // --------------
        System.out.println();
        System.out.format("The hero used his %s to kill %s, the end.", mysticalObject, villain.getName());
        // --------------
    }
}