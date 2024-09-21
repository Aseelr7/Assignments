package Calculator.OOPCalc;

import java.util.Scanner;

public class CalcOperator {
    public double numOne;
    public double numTwo;
    public Scanner input;

    public CalcOperator(){
        numOne = 0;
        numTwo = 0;
        input = new Scanner(System.in);
    }

    public void enterNumbers (){
        System.out.println("Please enter the first Number");
        numOne = input.nextDouble();
        System.out.println("Please enter the second Number");
        numTwo = input.nextDouble();
    }

    public void displayNums(){
        System.out.println("First Number: " + numOne);
        System.out.println("Second Number: " + numTwo);
    }

    public double addNums(){
        return numOne + numTwo;
    }

    public double subtractNums(){
        return numOne - numTwo;
    }

    public double multiplyNums(){
        return numOne * numTwo;
    }

    public double divideNums(){
        if (numTwo == 0) {
            System.out.println("Can't divide a number by 0");
            return Double.NaN; // Return NaN to indicate an invalid result
        }
        return numOne / numTwo;
    }
}
