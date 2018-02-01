public class Player2 {
	int weapon;
	String name;

	void shoot() {
		String[] weapons = {"rock", "paper", "scissors"};
		
		System.out.println(name + " chooses " + weapons[weapon - 1]);
	}
}

