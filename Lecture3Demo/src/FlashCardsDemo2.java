/**
 * In this version, the three cards are kept in an array
 * 
 * @author skelly
 *
 */
public class FlashCardsDemo2 {

	public static void main(String[] args) {
		System.out.println("Java Flash Cards");
		System.out.println("----------------");
		System.out.println();
		
		System.out.println("Let's practice some math.");
		System.out.println();
		
		// Create an array to store the three cards
		FlashCard[] deck = new FlashCard[3];

		// Fill the boxes in the array with cards
		deck[0] = new FlashCard();
		deck[0].a = 5;
		deck[0].b = 4;
		
		deck[1] = new FlashCard();
		deck[1].a = 12;
		deck[1].b = 3;
		
		deck[2] = new FlashCard();
		deck[2].a = 2;
		deck[2].b = 6;
		
		// Quiz the user with the cards in the array
		deck[0].quiz();
		deck[1].quiz();
		deck[2].quiz();
	}

}
