package Answers.DataTypes;

public class ExtraQuestions {

    public static void main(String[] args) {
        // Answer 1

        String java = "Java is more than just Java, it's a platform!";
        System.out.println(java.replace("Java","JAVA"));

        // Answer 2

        String hello = " Hello, World! ";
        System.out.println(hello.trim());

        // Answer 3

        String str1 = " Java", str2 = "Java ";

        if (str1.trim().equals(str2.trim())) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }

        // Answer 4

        String err = " ERROR ";
        err = err.trim();
        err = err.toLowerCase();
        err = err.replace("error","warning");
        System.out.println(err);

        // Answer 5

        String st = "concatenation";
        System.out.println(st.indexOf("cat"));

        // Answer 6

        String hi = "Hello, World!";
        System.out.println(hi.indexOf("Java"));





    }
}
