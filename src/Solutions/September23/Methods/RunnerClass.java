package Solutions.September23.Methods;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RunnerClass {
    public static void main(String[] args) {
        BasicMethod obj = new BasicMethod();

        System.out.println(obj.sum(12,12,10));

        obj.minMax(122,1,2,3,-1,22);
        System.out.println("*****************************************************************");
        int[] normalArray = {1,2,3,4,5,6,2,3,3,3,3,3,3,7,8};
        System.out.println(Arrays.toString(obj.reverserValue(normalArray)));

        obj.reverserPrint(normalArray);

        System.out.println("*****************************************************************");

        obj.printPattern(6);

        System.out.println("*****************************************************************");

        obj.celsiusToFahrenheit(32);


    }


}
