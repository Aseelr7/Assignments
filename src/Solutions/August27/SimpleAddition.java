package Solutions.August27;
import java.util.Scanner;
public class SimpleAddition {
    public static void main(String[] args) {

        var input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter another Integer: ");
        int num2 = input.nextInt();


        int sum = num2 + num1;
        System.out.println(sum);




    }
}
