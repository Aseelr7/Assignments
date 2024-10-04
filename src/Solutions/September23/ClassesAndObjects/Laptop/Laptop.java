package Solutions.September23.ClassesAndObjects.Laptop;

 public class Laptop {

    String brand;
    String model;
    double price;

    public Laptop( String brand,String model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("The Brand of the Laptop is: " + brand);
        System.out.println("The Model of the Laptop is: " + model);
        System.out.println("The Price of the Laptop is: " + price);
    }

}

