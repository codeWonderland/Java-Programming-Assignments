public class FlashCardGame {

    public static void main(String[] args) {
        System.out.println("Java Flash Cards");
        System.out.println("----------------");
        System.out.println();

        System.out.println("Let's do some trivia.");
        System.out.println();

        FlashCard[] deck = new FlashCard[5];

        deck[0] = new FlashCard("Which iPhone had the most variety of color?", "1. iPhone 5",
                "2. iPhone 5c", "3. iPhone 5s", "4. iPhone 6", 2);

        deck[1] = new FlashCard("Which iPhone first implemented Touch ID?", "1. iPhone 5",
                "2. iPhone 5c", "3. iPhone 5s", "4. iPhone 6", 3);

        deck[2] = new FlashCard("Which iPhone had the first plus model?", "1. iPhone 5s",
                "2. iPhone 6", "3. iPhone 6s", "4. iPhone 7", 2);

        deck[3] = new FlashCard("Which iPhone removed the headphone port?", "1. iPhone 5s",
                "2. iPhone 6", "3. iPhone 6s", "4. iPhone 7", 4);

        deck[4] = new FlashCard("Which iPhone introduced the black color?", "1. iPhone 5s",
                "2. iPhone 6", "3. iPhone 6s", "4. iPhone 7",4);

        for (int i = 0; i < deck.length; i++) {
            deck[i].quiz();
        }
    }

}