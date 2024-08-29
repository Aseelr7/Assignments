package Solutions.August27;

public class CalculatingBMI {
    public static void main(String[] args) {
        double weightInKg = 70.0;
        double heightInMeters = 1.75;

        double BMI = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("Your BMi is " + BMI);
    }
}
