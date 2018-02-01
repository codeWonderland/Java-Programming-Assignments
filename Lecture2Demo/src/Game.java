/**
 * A class representing a game of Rock, Paper, Scissors
 * 
 * @author skelly
 */
public class Game {
	Player2 player1;
	Player2 player2;
	
	void play() {
		player1.shoot();
		player2.shoot();

		if (player1.weapon == player2.weapon) {
			System.out.println("The players picked the same weapon, it's a tie!");
		} else if (player1.weapon == 1 && player2.weapon == 2) {
			System.out.println("Paper beats rock, " + player2.name + " wins!");
		} else if (player1.weapon == 2 && player2.weapon == 1) {
			System.out.println("Paper beats rock, " + player1.name + " wins!");
		} else if (player1.weapon == 3 && player2.weapon == 1) {
			System.out.println("Rock beats scissors, " + player2.name + " wins!");
		} else if (player1.weapon == 1 && player2.weapon == 3) {
			System.out.println("Rock beats scissors, " + player1.name + " wins!");
		} else if (player1.weapon == 2 && player2.weapon == 3) {
			System.out.println("Scissors beats paper, " + player2.name + " wins!");
		} else if (player1.weapon == 3 && player2.weapon == 2) {
			System.out.println("Scissors beats paper, " + player1.name + " wins!");
		}
	}

}
