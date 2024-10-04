package Solutions.September23.Encapsulation.BankAccountQ1;

public class BankAccount {

    private double balance;
    private String accountNumber;

    public BankAccount(double balance, String accountNumber){
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("Amount Deposited: $" + amount);
        System.out.println("Total Balance: $" + balance);
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("Insufficient Balance, your balance is: $" + balance);
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn: $" + amount);
            System.out.println("Remaining balance: $" + balance);
        }
    }

    public void getBalance(){
        System.out.println("Your Balance is: $" + balance);
    }

}


class ATM{
    public static void main(String[] args) {

        BankAccount BofA = new BankAccount(13000.2, "332001899309");

        BofA.deposit(10000);
        BofA.withdraw(14000);
        BofA.getBalance();


    }
}
