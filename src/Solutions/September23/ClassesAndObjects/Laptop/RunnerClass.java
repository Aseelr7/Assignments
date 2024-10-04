package Solutions.September23.ClassesAndObjects.Laptop;

public class RunnerClass {

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "Inspiron", 800);

        System.out.println(laptop.brand);
        System.out.println(laptop.model);
        System.out.println(laptop.price);


        Laptop laptopTwo = new Laptop("Hp", "Envy", 1000.99);

        System.out.println(laptopTwo.brand);
        System.out.println(laptopTwo.model);
        System.out.println(laptopTwo.price);

        System.out.println("************************************************************");
        laptop.displayDetails();

        laptop.model = "Razer";
        System.out.println(laptop.model);


    }
}
