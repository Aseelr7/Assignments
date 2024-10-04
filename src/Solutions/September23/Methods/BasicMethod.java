package Solutions.September23.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BasicMethod {

    public void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public double average(double numOne, double numTwo, double numThree) {
        return (numOne + numTwo + numThree) / 3;
    }

    public void factorial(int input) {
        int result = 1;
        for (int i = input; i >= 1; i--) {
            result = result * i;
        }
        System.out.println("The factorial of " + input + " is " + result);

    }

    public int sum(int... numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

    public void minMax(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            System.out.println("No numbers provided");
        } else {

            int minimum = Integer.MAX_VALUE;
            int maximum = Integer.MIN_VALUE;
            for (int number : numbers) {
                if (minimum > number) {
                    minimum = number;
                }
                if (maximum < number) {
                    maximum = number;
                }
            }
            System.out.println("The minimum number is: " + minimum);
            System.out.println("The maximum number is: " + maximum);
        }
    }

    public void reverserPrint(int[] arr) {
        int[] reverser = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reverser[i] = arr[arr.length - 1 - i];
        }
        System.out.print("Reversed Array: ");
        System.out.println(Arrays.toString(reverser));
    }

    public int[] reverserValue(int[] arr) {
        int[] reverser = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            reverser[i] = arr[arr.length - 1 - i];
        }
        return reverser;
    }

    public void printPattern(int height) {

        for (int i = 1; i <= height; i++) {
            for (int k = height; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


    }

    public void celsiusToFahrenheit(double celsius){
        double fahrenheit;

        fahrenheit = celsius * 1.8 + 32;

        System.out.println(celsius + "°C Celsius is Equal to: " + fahrenheit + "°F" );


    }

}




