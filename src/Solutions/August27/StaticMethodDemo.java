package Solutions.August27;

public class StaticMethodDemo {

    static int counter;

    public static void incrementCounter(){
        System.out.println(++counter);
    }

    public static void main(String[] args) {

        incrementCounter();
        incrementCounter();

    }
}
