package Solutions.August27;

public class StaticVariableDemo {
    static int counter;
    public static void main(String[] args) {

        counter ++;
        System.out.println(counter);

        StaticVariableDemo obj = new StaticVariableDemo();
        counter ++;
        System.out.println(counter);


    }
}
