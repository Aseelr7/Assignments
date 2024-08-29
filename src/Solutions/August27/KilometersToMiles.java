package Solutions.August27;

import java.util.Scanner;

public class KilometersToMiles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a distance in Kilometers: ");
        double kilometers = input.nextDouble();

        double miles =  kilometers * 0.621371;

        System.out.println("That would be " + miles + " Miles");

    }
}
