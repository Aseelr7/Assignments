package Solutions.August27;

public class SplittingABill {
    public static void main(String[] args) {

        double totalBill = 250.0;
        int numberOfPeople = 5;
        double payPerPerson = totalBill / numberOfPeople;

        System.out.println("Each of you should pay: " + payPerPerson);
    }
}
