package Solutions.August27;

import java.util.Scanner;

public class ReadAndConcatenate {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        String firstName = input.next();

        System.out.print("Please enter your last name: ");
        String lastName = input.next();

        String fullName = firstName + " " + lastName;

        System.out.println("Your full name is " + fullName);



    }
}
