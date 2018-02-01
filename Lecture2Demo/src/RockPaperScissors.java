import java.util.Scanner;

/**
 * This application plays a game of Rock, Paper, Scissors.
 * 
 * @author skelly
 */
@SuppressWarnings("resource")
public class RockPaperScissors {
	
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
		
		// The computer selects at random
		int computerWeapon = (int)(Math.random() * 3) + 1;
		
		// Get the weapon that the user types in
		Scanner input = new Scanner(System.in);
		int userWeapon = input.nextInt();

		// Display the computer's choice
		if (computerWeapon == 1) {
			System.out.println("Computer picked rock");
		} else if (computerWeapon == 2) {
			System.out.println("Computer picked paper");
		} else {
			System.out.println("Computer picked scissors");
		}
		
		// Display the results of the battle
		if (userWeapon == computerWeapon) {
			System.out.println("The players picked the same weapon, it's a tie!");
		} else if (userWeapon == 1 && computerWeapon == 2) {
			System.out.println("Paper beats rock, Computer wins!");
		} else if (userWeapon == 2 && computerWeapon == 1) {
			System.out.println("Paper beats rock, Player 1 wins!");
		} else if (userWeapon == 3 && computerWeapon == 1) {
			System.out.println("Rock beats scissors, Computer wins!");
		} else if (userWeapon == 1 && computerWeapon == 3) {
			System.out.println("Rock beats scissors, Player 1 wins!");
		} else if (userWeapon == 2 && computerWeapon == 3) {
			System.out.println("Scissors beats paper, Computer wins!");
		} else if (userWeapon == 3 && computerWeapon == 2) {
			System.out.println("Scissors beats paper, Player 1 wins!");
		}
	}
	
}
