/**
 * A class representing a player in the game of Rock, Paper, Scissors
 */
public class Player2 {
	Weapon2 weapon;
	String name;

	void fight(Player2 otherPlayer) {
        System.out.println(name + " chooses " + weapon.name);
        System.out.println(otherPlayer.name + " chooses " + otherPlayer.weapon.name);

        if (this.weapon.beats(otherPlayer.weapon)) {
	        System.out.println(name + " wins!");
	    } else if (otherPlayer.weapon.beats(this.weapon)) {
            System.out.println(otherPlayer.name + " wins!");
	    } else {
        	System.out.println("It's a tie!");
		}
	}
}
