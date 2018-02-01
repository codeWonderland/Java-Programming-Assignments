/**
 * Created by aliceeaster on 1/26/17.
 */
public class LoopPractice {

    public static void main(String args[]) {

        System.out.print("Even numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(2 * (i + 1));

            if (i != 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.print("Square numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((int) java.lang.Math.pow((i + 1) , 2));

            if (i != 9) {
                System.out.print(", ");
            }
        }
        System.out.println();

    }
}