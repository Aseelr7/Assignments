package Calculator.OOPCalc;

import java.util.Scanner;

public class CalcMenu {

    CalcOperator operator;
    Scanner input;

    public CalcMenu() {
        operator = new CalcOperator();
        input = new Scanner(System.in);
    }

    public void printMenu() {
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
    }

    public void choiceHandler(int choice) {
        switch (choice) {
            case 1:
                operator.enterNumbers();
                break;
            case 2:
                operator.displayNums();
                break;
            case 3:
                System.out.println("Result Addition is : " + operator.addNums());
                break;
            case 4:
                System.out.println("Result of Subtraction is : " + operator.subtractNums());
                break;
            case 5:
                System.out.println("Result of Multiplication is : " + operator.multiplyNums());
                break;
            case 6:
                System.out.println("Result of Division is : " + operator.divideNums());
                break;
            case 7:
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }

    public void startCalc(){
        int choice = 0;
        do {
            printMenu();
            choice = input.nextInt();
            choiceHandler(choice);
        } while(choice != 7);
    }
}
