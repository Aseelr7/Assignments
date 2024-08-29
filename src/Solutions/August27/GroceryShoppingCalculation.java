package Solutions.August27;

public class GroceryShoppingCalculation {
    public static void main(String[] args) {

        int apples = 3 , bananas = 6;
        double pricePerApple = 0.50 , pricePerBanana = 0.30;

        double totalCost = (apples * pricePerApple) + (bananas * pricePerBanana);

        System.out.println("Your total is: " + totalCost);

    }
}
