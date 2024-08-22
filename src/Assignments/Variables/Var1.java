package Answers.Variables;

public class Var1 {

    public static void main(String[] args) {

        int breadCount;
        int milkLiters;
        boolean isEggsRequired;
        String storeName;

        breadCount = 3;
        milkLiters = 2;
        isEggsRequired = true;
        storeName = "Martland";

        milkLiters = 0;
        storeName = "BreadBasket";

        System.out.println("Shopping at " + storeName + ". " + "need to buy " + breadCount + " loaves of bread, " + milkLiters + " liters of milk. " + "Eggs required: " + isEggsRequired);

        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);

    }
}
