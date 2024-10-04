package Solutions.September23.Operators;

public class Q8_Q9_Q10 {
    public static void main(String[] args) {

        boolean isAdmin = true;
        if (!isAdmin) System.out.println("Access Granted");
        else System.out.println("Access Denied");

        System.out.println("************************************************************");

        boolean handShake = true, knowsPassword = true;

        if (handShake ^ knowsPassword) System.out.println("Welcome in Brotha");
        else System.out.println("You sneaky spy!");

        System.out.println("************************************************************");


        boolean switchA = true, switchB = false;

        if (switchA ^ switchB) System.out.println("Light On");
        else System.out.println("Lights Off");
    }
}
