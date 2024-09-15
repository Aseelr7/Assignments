package Sep14Practice;

public class NestedIfStatement {
    public static void main(String[] args) {

        int i = 120;
        int j = 300;
        if(i == 10){
            System.out.println('A');

            if( j == 300){
                System.out.println('B');
            } else System.out.println('C');

        } else System.out.println('D');{

            if (j == 30){
                System.out.println('E');
            } else System.out.println('G');
        }

    }
}
