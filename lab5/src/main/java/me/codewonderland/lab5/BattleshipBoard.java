package me.codewonderland.lab5;

/**
 * Created by aliceeaster on 2/23/17.
 */
public class BattleshipBoard {

    public static void main(String[] args) {

        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(String letter : letters) {
            for(int number : numbers) {
                System.out.print(letter);
                System.out.format("%d ", number);
            }
            System.out.println();
        }
    }
}
