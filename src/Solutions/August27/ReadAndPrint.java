package Solutions.August27;
import java.util.Scanner;
public class ReadAndPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type your First Name: ");
        String firstName = input.next();

        System.out.print("Type your Last Name: ");
        String lastName = input.next();

        System.out.println("Hello there, " + firstName + " " + lastName);
    }
}
