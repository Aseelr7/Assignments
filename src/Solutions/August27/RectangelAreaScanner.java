package Solutions.August27;

import java.util.Scanner;

public class RectangelAreaScanner {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the length of your rectangle: ");
        double length = in.nextDouble();

        System.out.print("Please enter the width of your rectangle: ");
        double width = in.nextDouble();

        double area = length * width;

        System.out.println("The Area is " + area);


    }
}
