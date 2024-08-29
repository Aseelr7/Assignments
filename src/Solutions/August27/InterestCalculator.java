package Solutions.August27;

public class InterestCalculator {

    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 5.5;
        int time = 2;

        double simpleInterest = (principal * rate * time) / 100;
        System.out.println(simpleInterest);

    }
}
