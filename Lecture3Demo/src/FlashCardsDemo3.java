/**
 * Like the previous version, but now the questions are randomized
 * 
 * @author skelly
 *
 */
public class FlashCardsDemo3 {

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
		deck[0].a = (int)(Math.random() * 12);
		deck[0].b = (int)(Math.random() * 12);
		
		deck[1] = new FlashCard();
		deck[1].a = (int)(Math.random() * 12);
		deck[1].b = (int)(Math.random() * 12);
		
		deck[2] = new FlashCard();
		deck[2].a = (int)(Math.random() * 12);
		deck[2].b = (int)(Math.random() * 12);
		
		// Quiz the user with the cards in the array
		deck[0].quiz();
		deck[1].quiz();
		deck[2].quiz();
	}
	
}
