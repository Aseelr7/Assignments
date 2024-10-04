package Solutions.September23.Encapsulation.SecurePassword;

public class LoginSystem {

   private String hashedPassword = "";

    public LoginSystem(){

    }

    public void setPassword(String password){
        char[] normalPassword = password.toCharArray();


        for (int i = normalPassword.length - 1 ; i >= 0 ; i--){

            hashedPassword += normalPassword[i];
        }
    }

    public void checkPassword(String passwordCheck){
        char[] normalPassword = passwordCheck.toCharArray();
        String reversedTwo = "";

        for (int i = normalPassword.length - 1 ; i >= 0 ; i--){

            reversedTwo += normalPassword[i];
        }

        if (reversedTwo.equals(hashedPassword)){
            System.out.println("Passwords Match");
        } else System.out.println("Passwords Don't Match");

    }

   }



class runnerSystem{
    public static void main(String[] args) {
        LoginSystem obj = new LoginSystem();

        obj.setPassword("1234");
        obj.checkPassword("122");

    }
}

