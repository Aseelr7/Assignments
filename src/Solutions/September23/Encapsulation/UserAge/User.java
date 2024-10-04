package Solutions.September23.Encapsulation.UserAge;

public class User {
    private int age;

    public User(int age){
        this.age = age;
    }

    public void setAge(int age){
        if (age > 0 && age <= 120){
            this.age = age;
        } else throw new RuntimeException("Invalid Age please enter a number between 1 - 120");
    }
    public int getAge(){
        return this.age;
    }

}

class UserRunner{
    public static void main(String[] args) {
        User user1 = new User(122);
        System.out.println( user1.getAge());
        user1.setAge(111);
        System.out.println( user1.getAge());
    }
}
