package Solutions.September03.incrementAndDecrement;

public class IncrementInIfStatement17_18 {
    public static void main(String[] args) {

        int a = 4; if (++a == 5) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }



        int b = 5;
        while (b-- > 0) { System.out.println(b); }
    }
}
