import java.util.Scanner;

@SuppressWarnings("resource")
public class GuessingGame {
    
    public static void main(String args[]) {
        int answer = (int)(Math.random() * 100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100");
        
        System.out.println("What's your guess?");
        
        Scanner userInput = new Scanner(System.in);
        int guess = userInput.nextInt();
        
        if (guess == answer) {
            System.out.println("You're right!");
        } else {
            System.out.println("Wrong, dummy, it was " + answer);
        }
    }

}
