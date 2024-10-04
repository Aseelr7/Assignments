package Solutions.September23.Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("**************************************************");

        int cookies = 20;
        int days = 0;

        while (cookies > 0) {
            days++;
            cookies -= 2;
        }
        System.out.println(days + " Days");

        System.out.println("**************************************************");

        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0) {
                System.out.print(i + ".");
            }
        }

        System.out.println();
        System.out.println("**************************************************");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("**************************************************");

        for (int i = 5; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("**************************************************");


        Scanner input = new Scanner(System.in);
        int correctPin = 1234;
        int attempts = 3;
        int userPin = 0;
        boolean run = true;
        do {
            System.out.println("Please enter your pin");
            userPin = input.nextInt();
            if (userPin == correctPin) {
                System.out.println("Your Pin is Correct");
                run = false;
            } else {
                System.out.println("Incorrect Try Again");
                attempts--;
            }
            if (attempts == 0) {
                run = false;
            }
        } while (run);

        if (attempts == 0) System.out.println("Card Blocked");


        System.out.println("**************************************************");

        System.out.print("Enter a number");
        int userIn = input.nextInt();
        int result = 1;

        for (int i = userIn; i >= 1; i--) {

            result *= i;

        }
        System.out.println(result);


        System.out.println("**************************************************");

        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;

        fib[2] = fib[2 - 1] + fib[2 - 2];

        for (int i = 2; i <= 9; i++) {

            fib[i] = fib[i - 1] + fib[i - 2];

        }

        for (int i = 0; i < fib.length; i++) {
            System.out.print(fib[i] + ", ");
        }


        System.out.println("**************************************************");


        System.out.println("Enter a number and i will check if it is prime or not");
        int userNum = input.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= 1000; i++) {
            if (userNum <= 1) {
                isPrime = false;
                break;
            } else if (userNum != i && userNum % i == 0) {
                isPrime = false;
            } else isPrime = true;
        }

        if (isPrime) {
            System.out.println(userNum + " Is a prime number");
        } else {
            System.out.println(userNum + " Is not a prime number");
        }


        System.out.println("**************************************************");


        int[] number = {1, 2, 3, 4};

        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
        }


        System.out.println("**************************************************");


        for (int i = 1; i <= 9; i++) {

            for (int k = 9; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        System.out.println("**************************************************");


    }
}
