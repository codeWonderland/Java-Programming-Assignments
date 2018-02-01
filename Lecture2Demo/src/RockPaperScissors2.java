import java.util.Scanner;

/**
 * This application plays a game of Rock, Paper, Scissors.
 * 
 * @author skelly
 */
@SuppressWarnings("resource")
public class RockPaperScissors2 {

	public static void main(String[] args) {
		// Print out an introduction
		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.println();
		System.out.println("You are playing as Player 1");
		System.out.println();
		System.out.println("Choose your weapon:");
		System.out.println("1: Rock");
		System.out.println("2: Paper");
		System.out.println("3: Scissors");
		
		// Instantiate a new player object to represent the computer
		Player computer = new Player();
		computer.name = "Computer";
		computer.weapon = (int)(Math.random() * 3) + 1;
		
		// Instantiate a new player object to represent the user
		Player user = new Player();
		user.name = "Player 1";

		Scanner input = new Scanner(System.in);
		user.weapon = input.nextInt();

		// Display the weapons each player selected
		user.shoot();
		computer.shoot();
		
		// Display the results of the battle
		if (user.weapon == computer.weapon) {
			System.out.println("The players picked the same weapon, it's a tie!");
		} else if (user.weapon == 1 && computer.weapon == 2) {
			System.out.println("Paper beats rock, Computer wins!");
		} else if (user.weapon == 2 && computer.weapon == 1) {
			System.out.println("Paper beats rock, Player 1 wins!");
		} else if (user.weapon == 3 && computer.weapon == 1) {
			System.out.println("Rock beats scissors, Computer wins!");
		} else if (user.weapon == 1 && computer.weapon == 3) {
			System.out.println("Rock beats scissors, Player 1 wins!");
		} else if (user.weapon == 2 && computer.weapon == 3) {
			System.out.println("Scissors beats paper, Computer wins!");
		} else if (user.weapon == 3 && computer.weapon == 2) {
			System.out.println("Scissors beats paper, Player 1 wins!");
		}
	}
	
}
