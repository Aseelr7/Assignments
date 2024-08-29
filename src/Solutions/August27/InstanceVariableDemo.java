package Solutions.August27;

public class InstanceVariableDemo {

    int instanceCounter = 0;

    public static void main(String[] args) {

        InstanceVariableDemo obj1 = new InstanceVariableDemo();
        InstanceVariableDemo obj2 = new InstanceVariableDemo();

        obj1.instanceCounter ++;
        obj2.instanceCounter ++;


        System.out.println(obj1.instanceCounter);
        System.out.println(obj2.instanceCounter);
    }
}
