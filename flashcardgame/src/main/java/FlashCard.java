import java.util.Scanner;

public class FlashCard {

    private String question, answer1, answer2, answer3, answer4;;
    private int answer;

    public FlashCard(String question, String answer1, String answer2, String answer3, String answer4, int answer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.answer = answer;
    }

    public void quiz() {
        System.out.println(question);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);

        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        if (guess == answer) {
            System.out.println("Correct!");
        } else {
            switch(answer) {
                case 1:
                    System.out.format("Sorry! The correct answer is %s", answer1);
                    break;
                case 2:
                    System.out.format("Sorry! The correct answer is %s", answer2);
                    break;
                case 3:
                    System.out.format("Sorry! The correct answer is %s", answer3);
                    break;
                case 4:
                    System.out.format("Sorry! The correct answer is %s", answer4);
                    break;
                default:
                    System.out.print("Sorry! That is not a valid answer!");
            }
        }

        System.out.println();
        System.out.println();
    }
}