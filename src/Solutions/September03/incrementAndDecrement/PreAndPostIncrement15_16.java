package Solutions.September03.incrementAndDecrement;

public class PreAndPostIncrement15_16 {
    public static void main(String[] args) {
        int u = 3;
        int result = ++u + u++;
        System.out.println(u);
        System.out.println(result);

        int v = 9;
        int results = --v - v--;
        System.out.println(v);
        System.out.println(results);

    }
}
