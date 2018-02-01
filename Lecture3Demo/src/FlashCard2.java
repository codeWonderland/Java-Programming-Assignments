import java.util.Scanner;

@SuppressWarnings("resource")
public class FlashCard2 {
	int a;
	int b;
	
	void quiz() {
		System.out.println("What is " + a + " times " + b + "?");
		
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		if (guess == (a * b)) {
			System.out.println("You're correct!");
		} else {
			System.out.println("I'm sorry, that's incorrect.");
			System.out.println("The answer is " + (a * b));
		}
		
	}

}
