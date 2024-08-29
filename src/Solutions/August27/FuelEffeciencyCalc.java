package Solutions.August27;

public class FuelEffeciencyCalc {
    public static void main(String[] args) {

        double distance = 500.0 , fuelUsed = 40.0;

        double fuelEfficiency = distance / fuelUsed;

        System.out.println("You spent " + fuelEfficiency + "Liters of fuel per each kilometer");
        System.out.println("I am curios on what diabolical vehicle you drive 12 Liters really?");
    }
}
