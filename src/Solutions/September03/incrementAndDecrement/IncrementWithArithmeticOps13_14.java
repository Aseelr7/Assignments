package Solutions.September03.incrementAndDecrement;

public class IncrementWithArithmeticOps13_14 {
    public static void main(String[] args) {

        int m = 7;

        int result = m++ * 2 + --m;
        System.out.println(result);
        System.out.println(m);

        int n = 14;
        int results = --n + n-- * 3;
        System.out.println(n);
        System.out.println(results);

    }
}
