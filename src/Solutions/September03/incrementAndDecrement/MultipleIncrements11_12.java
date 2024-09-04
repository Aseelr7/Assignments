package Solutions.September03.incrementAndDecrement;

public class MultipleIncrements11_12 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;

        int result = x++ + ++y;

        System.out.println(result);
        System.out.println("x: " +x);
        System.out.println("y: " +y);


        int a = 10;
        int b = 5;
        int results = a-- - ++b;
        System.out.println(results);
        System.out.println("a: " +a);
        System.out.println("b: " +b);


    }
}
