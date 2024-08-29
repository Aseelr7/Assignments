package Solutions.August27;

import java.util.Scanner;

public class TotalCalc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the quantity of the items you have purchased: ");
        int quantity = in.nextInt();

        System.out.print("Enter the price for each of the items you have purchased: ");
        double price = in.nextDouble();

        double total = quantity * price;

        System.out.println("The total is: " + total );

    }
}
