import java.util.Scanner;

/**
 * This application plays a game of Rock, Paper, Scissors.
 * 
 * @author skelly
 */
@SuppressWarnings("resource")
public class RockPaperScissors3 {

	public static void main(String[] args) {
		// Print out an introduction
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println();
		System.out.println("What is your name?");
		
		// Instantiate a new player object for the user
		Scanner input = new Scanner(System.in);
		Player2 user = new Player2();
		
		// Set the player's name to whatever the user enters
		user.name = input.nextLine();
		
		// As the user to choose a weapon
		System.out.println("Choose your weapon:");
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissors");
		
		// Set the player's weapon to whatever the user enters
		user.weapon = input.nextInt();
		
		// Instantiate a new player object for the computer
		Player2 computer = new Player2();
		computer.name = "Computer";
		computer.weapon = (int)(Math.random() * 3) + 1;
		
		// Instantiate a new game object and set the two players
		Game game = new Game();
		game.player1 = user;
		game.player2 = computer;
		
		// Tell the game to play
		game.play();		
	}
	
}
