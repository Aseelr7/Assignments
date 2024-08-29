package Solutions.August27;

public class InitializationBlockDemo {

    static int staticVar;
    int instanceVar;

    static{
        staticVar = 50;
    }

    {instanceVar = 25;}
    public static void main(String[] args) {

        System.out.println(staticVar);

        InitializationBlockDemo obj = new InitializationBlockDemo();

        System.out.println(obj.instanceVar);

    }
}
