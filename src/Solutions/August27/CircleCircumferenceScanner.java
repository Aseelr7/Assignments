package Solutions.August27;

import java.util.Scanner;

public class CircleCircumferenceScanner {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius of a circle: ");
        double radius = in.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println(circumference + " Here is the circumference ");
    }
}
