/**
 * A class representing a player in the game of Rock, Paper, Scissors
 */
public class Player {
	int weapon;
	String name;

	void shoot() {
		if (weapon == 1) {
			System.out.println(name + " chooses rock");
		} else if (weapon == 2) {
			System.out.println(name + " chooses paper");
		} else {
			System.out.println(name + " chooses scissors");
		}
	}
}
