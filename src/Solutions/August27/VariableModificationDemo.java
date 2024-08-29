package Solutions.August27;

public class VariableModificationDemo {
    public static void main(String[] args) {

        int num = 10;
        String greeting = "Hello";

        num = 20;
        greeting = greeting + " World";

        System.out.println(num);
        System.out.println(greeting);
    }
}
