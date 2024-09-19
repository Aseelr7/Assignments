package Calculator;
import java.util.Scanner;
public class CalcBasic {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int userChoice;
            double numOne = 0.0;
            double numTwo = 0.0;
            boolean numbersEntered = false;

            do {
                System.out.println("***************************************");
                System.out.println("*                                     *");
                System.out.println("*        1: Enter Numbers             *");
                System.out.println("*        2: Display All Numbers       *");
                System.out.println("*        3: Add Numbers               *");
                System.out.println("*        4: Subtract Numbers          *");
                System.out.println("*        5: Multiply Numbers          *");
                System.out.println("*        6: Divide Numbers            *");
                System.out.println("*        7: Exit                      *");
                System.out.println("*                                     *");
                System.out.println("***************************************");

                System.out.print("Your Choice: ");
                userChoice = input.nextInt();

                switch (userChoice) {
                    case 1:
                        System.out.print("Enter the first number: ");
                        numOne = input.nextDouble();
                        System.out.print("Enter the second number: ");
                        numTwo = input.nextDouble();
                        numbersEntered = true;
                        break;

                    case 2:
                        if (!numbersEntered) {
                            System.out.println("Numbers have not been entered yet.");
                        } else {
                            System.out.println("***************************************");
                            System.out.println("* Number 1: " + numOne + "                  *");
                            System.out.println("* Number 2: " + numTwo + "                  *");
                            System.out.println("***************************************");
                        }
                        break;

                    case 3:
                        if (!numbersEntered) {
                            System.out.println("Numbers have not been entered yet.");
                        } else {
                            System.out.println("***************************************");
                            System.out.println("* Result of " + numOne + " + " + numTwo + " is: " + (numOne + numTwo) + " *");
                            System.out.println("***************************************");
                        }
                        break;

                    case 4:
                        if (!numbersEntered) {
                            System.out.println("Numbers have not been entered yet.");
                        } else {
                            System.out.println("***************************************");
                            System.out.println("* Result of " + numOne + " - " + numTwo + " is: " + (numOne - numTwo) + " *");
                            System.out.println("***************************************");
                        }
                        break;

                    case 5:
                        if (!numbersEntered) {
                            System.out.println("Numbers have not been entered yet.");
                        } else {
                            System.out.println("***************************************");
                            System.out.println("* Result of " + numOne + " * " + numTwo + " is: " + (numOne * numTwo) + " *");
                            System.out.println("***************************************");
                        }
                        break;

                    case 6:
                        if (!numbersEntered) {
                            System.out.println("Numbers have not been entered yet.");
                        } else if (numTwo == 0) {
                            System.out.println("Error: Division by zero.");
                        } else {
                            System.out.println("***************************************");
                            System.out.println("* Result of " + numOne + " / " + numTwo + " is: " + (numOne / numTwo) + " *");
                            System.out.println("***************************************");
                        }
                        break;

                    case 7:
                        System.out.println("Exiting the program...");
                        break;

                    default:
                        System.out.println("Invalid input. Please try again.");
                }
            } while (userChoice != 7);

        }
    }


