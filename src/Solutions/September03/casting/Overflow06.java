package Solutions.September03.casting;

public class Overflow06 {

    public static void main(String[] args) {
        long bigNum = 2147483648L;
        int smallNum = (int)bigNum;
        System.out.println(smallNum);
    }
}
