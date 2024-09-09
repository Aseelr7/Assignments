package Solutions.September03.OperationsPrecedence;

import java.util.Scanner;

public class ComplexExpressionWithScanner10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type your first number: ");
        int firstNumber= input.nextInt();



        System.out.print("Type your second number: ");
        int secondNumber = input.nextInt();

        int result = (firstNumber + secondNumber) * firstNumber / secondNumber + 2;
        System.out.println("The result is: " + result);
    }
}
