import java.util.Scanner;

/**
 * This application plays a game of Rock, Paper, Scissors.
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
		Player2 computer = new Player2();
		computer.name = "Computer";
		computer.weapon = createWeapon((int)(Math.random() * 3) + 1);
		
		// Instantiate a new player object to represent the user
		Player2 user = new Player2();
		user.name = "Player 1";

		Scanner input = new Scanner(System.in);
		user.weapon = createWeapon(input.nextInt());

		// Display the weapons each player selected
		user.fight(computer);
	}
	
	static Weapon2 createWeapon(int weaponNumber) {
	    if (weaponNumber == 1) {
	        return new Rock2();
	    } else if (weaponNumber == 2) {
	        return new Paper2();
	    } else {
	        return new Scissors2();
	    }
	}
	
}
