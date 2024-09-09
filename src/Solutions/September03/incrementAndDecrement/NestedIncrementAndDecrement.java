package Solutions.September03.incrementAndDecrement;

public class NestedIncrementAndDecrement {
    public static void main(String[] args) {

        int p = 2;
        int q = 3;
        int result = ++p + q++ - --q;

        System.out.println("P: " + p);
        System.out.println("Q: " + q);
        System.out.println("Result: " + result);


    }
}
