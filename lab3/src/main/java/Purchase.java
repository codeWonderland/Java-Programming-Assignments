
class Purchase {

    private double foodCost, drinksCost, subtotal,
                     taxCost, totalCost,
                     tip10, tip15, tip20;

    private void calcTransaction() {
        double tax = 0.06;

        this.subtotal = foodCost + drinksCost;
        this.taxCost = subtotal * tax;
        this.totalCost = subtotal + taxCost;
        this.tip10 = totalCost * 0.1;
        this.tip15 = totalCost * 0.15;
        this.tip20 = totalCost * 0.2;
    }


    Purchase(double foodCost, double drinksCost) {
        this.foodCost = foodCost;
        this.drinksCost = drinksCost;
        calcTransaction();
    }

    void displayBill() {
        System.out.println("      Check      ");
        System.out.println("-----------------");
        System.out.format("Food:      $%.2f", foodCost);
        System.out.println();
        System.out.format("Drinks:    $%.2f", drinksCost);
        System.out.println();
        System.out.println();
        System.out.format("Subtotal:  $%.2f", subtotal);
        System.out.println();
        System.out.format("6%% Tax:    $%.2f", taxCost);
        System.out.println();
        System.out.println("           ------");
        System.out.format("Total:     $%.2f", totalCost);
        System.out.println();
        System.out.println();
        System.out.println("-Suggested  tips-");
        System.out.format("10%%:       $%.2f", tip10);
        System.out.println();
        System.out.format("15%%:       $%.2f", tip15);
        System.out.println();
        System.out.format("20%%:       $%.2f", tip20);
    }
}
