package Solutions.August27;

public class VariableScopeDemo {
    static String globalVar = "Global";
    public static void printVariables(){
        System.out.println(globalVar);
    }
    public static void main(String[] args) {
        String localVar = "Local";

        printVariables();
        System.out.println(localVar);

    }
}
