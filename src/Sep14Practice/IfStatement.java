package Sep14Practice;
import java.util.Scanner;

public class IfStatement {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");

        int number = input.nextInt();


        // comparison
        if( number == 1 ){

            System.out.println("Number = 1");

        } else if (number == 2) {

            System.out.println("Number = 2");
        } else if (number == 3) {
            System.out.println("Number = 3");
        } else {
            System.out.println("none of the conditions are true");
        }





    }
}
