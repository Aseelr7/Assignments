package Solutions.September23.Conditionals;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

/*        System.out.print("What's the temperature");
        int temp = input.nextInt();

        if(temp < - 10) System.out.println("Don't go out brother!");
        else if(temp < 10) {
            System.out.println("Wear a heavy coat!");
        } else if (temp >= 10 && temp <= 20) {

            System.out.println("A light jacket will do.");
        } else if (temp > 20) {
            System.out.println("It's warm, just a T-shirt is fine!");
        }*/

        System.out.println("**********************************************************************");

        boolean hasWeapon = true;
        int energyLevel = 68;

        if(hasWeapon){
            if (energyLevel > 50) {
                System.out.println("Attack the enemy");
            } else {
                System.out.println("Need More Energy to attack");
            }
        }else System.out.println("Find A weapon First!");

        System.out.println("**********************************************************************");

        double grade = 88.7;
        if (grade > 90) {
            System.out.println("A");
        } else if (grade >= 80 && grade <= 89) {
            System.out.println("B");
        } else if (grade >= 70 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 69) {
            System.out.println("D");
        } else if (grade < 60 && grade >= 0) {
            System.out.println("Fail");
        } else System.out.println("Invalid Input");

        System.out.println("**********************************************************************");


        boolean isMember = true;
        double itemPrice = 99.99;

        double finalPrice = (isMember)? itemPrice - (itemPrice * 0.1)  : itemPrice;
        System.out.println(finalPrice);

        System.out.println("**********************************************************************");

        int dayOfWeek = 7;

        switch (dayOfWeek){
            case 1 :
                System.out.println("Saturday");
                break;
            case 2 :
                System.out.println("Sunday");
                break;
            case 3 :
                System.out.println("Monday");
                break;
            case 4 :
                System.out.println("TuesDay");
                break;
            case 5 :
                System.out.println("Wednesday");
                break;
            case 6 :
                System.out.println("Thursday");
                break;
            case 7 :
                System.out.println("Friday");
                break;
            default:
                System.out.println("Invalid Input");
        }

        System.out.println("**********************************************************************");
        String coffeeSize = "Small";

        switch (coffeeSize){
            case "Small" :
                System.out.println("2$");
                break;
            case "Medium":
            System.out.println("4$");
                break;
            case "Large":
            System.out.println("4$");
                break;
            case "Extra Large":
            System.out.println("5$");
                break;
            default:
                System.out.println("We don't have that size here");
        }


    }
}
