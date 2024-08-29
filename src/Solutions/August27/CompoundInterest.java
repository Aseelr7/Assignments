package Solutions.August27;

public class CompoundInterest {
    public static void main(String[] args) {

        double principalAmount = 2000 , annualRate = 4.5;
        int years = 5;
        double amount = principalAmount * Math.pow((1 + annualRate/100), years);
        System.out.println("The interest amount is " + amount);
    }
}
