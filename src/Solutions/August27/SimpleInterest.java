package Solutions.August27;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        var in = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = in.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double rate = in.nextDouble();

        System.out.print("Enter the years: ");
        int time = in.nextInt();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple interest is " + simpleInterest);
    }
}
