/**
 * Like the previous version, but now we use a loop to create five cards
 * @author skelly
 *
 */
public class FlashCardsDemo4 {
	
	public static void main(String[] args) {
		System.out.println("Java Flash Cards");
		System.out.println("----------------");
		System.out.println();
		
		System.out.println("Let's practice some math.");
		System.out.println();
		
		int numberOfCards = 10;
		
		// Create the deck as an array of size numberOfCards
		FlashCard[] deck = new FlashCard[numberOfCards];
		
		// Fill the deck of flashcards
		for (int i = 0; i < numberOfCards; i++) {
			deck[i] = new FlashCard();
			deck[i].a = (int)(Math.random() * 12);
			deck[i].b = (int)(Math.random() * 12);
		}

		// Use the deck of flashcards
		for (FlashCard card : deck) {
			card.quiz();
		}
	}
	
}
