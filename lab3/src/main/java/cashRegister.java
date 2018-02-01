import java.util.Scanner;

/**
 * Created by aliceeaster on 2/2/17.
 */
public class cashRegister {

    public static void main(String[] args) {

        double foodCost;
        double drinkCost;
        Scanner input = new Scanner(System.in);

        System.out.println("How much did the customer spend on food, in dollars?");
        foodCost = input.nextDouble();

        System.out.println("How much did the customer spend on drinks, in dollars?");
        drinkCost = input.nextDouble();

        Purchase myPurchase = new Purchase(foodCost, drinkCost);
        myPurchase.displayBill();
    }
}
