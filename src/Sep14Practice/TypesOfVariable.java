package Sep14Practice;

public class TypesOfVariable {

    // Class variable

    static String names = "Ahmad";

    // instance Variable
   public String instanceVar = "Karim";


    //
    String nameTwo = "Mahmood";

    public static void main(String[] args) {

        TypesOfVariable obj = new TypesOfVariable();

        System.out.println(obj.instanceVar);

        String localVar = "local";
        System.out.println(localVar);




        System.out.println(names);
        System.out.println(number);




    }

    static int number = 1;

}
