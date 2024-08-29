package Solutions.August27;

public class MonthlyPaymentCalculation {
    public static void main(String[] args) {

        double loanAmount = 15000.0 , annualInterestRate = 3.5;

        double monthlyPayment = (loanAmount * (annualInterestRate/100) / 12);

        System.out.println(monthlyPayment + " Is your monthly payment");
    }
}
