import java.util.Scanner;

@SuppressWarnings("resource")
public class GuessingGame2 {
    
    public static void main(String args[]) {
        int answer = (int)(Math.random() * 100) + 1;
        
        System.out.println("I'm thinking of a number between 1 and 100");
        
        boolean playing = true;
        
        Scanner userInput = new Scanner(System.in);
        
        while (playing) {
            System.out.println("What's your guess?");
            int guess = userInput.nextInt();
            
            if (guess > answer) {
                System.out.println("Too high, guess again.");
            } else if (guess < answer) {
                System.out.println("Too low, guess again.");
            } else {
                System.out.println("You're right!");
                playing = false;
            }
        }
    }

}
