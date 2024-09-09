package Solutions.September03.incrementAndDecrement;

public class CombiningIncrementAndDecrement {
    public static void main(String[] args) {

        int x = 10; int y = 5; if (x-- > 9 && ++y > 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
