/**
 * A simple flashcard program that asks the user three multiplication questions
 * 
 * @author skelly
 *
 */
public class FlashCardsDemo {

	public static void main(String[] args) {
		System.out.println("Java Flash Cards");
		System.out.println("----------------");
		System.out.println();
		
		System.out.println("Let's practice some math.");
		System.out.println();
		
		// Create the three cards
		FlashCard card1 = new FlashCard();
		card1.a = 5;
		card1.b = 4;
		
		FlashCard card2 = new FlashCard();
		card2.a = 12;
		card2.b = 3;
		
		FlashCard card3 = new FlashCard();
		card3.a = 2;
		card3.b = 6;
		
		// Quiz the user from the three cards
		card1.quiz();
		card2.quiz();
		card3.quiz();
	}

}
