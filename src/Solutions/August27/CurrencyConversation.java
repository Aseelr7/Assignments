package Solutions.August27;

public class CurrencyConversation {
    public static void main(String[] args) {

        double usdAmount = 100.0 , conversionRate = 0.85;

        double eurAmount = usdAmount * conversionRate;
        System.out.println("The amount in EUR is: " + eurAmount);

    }
}
