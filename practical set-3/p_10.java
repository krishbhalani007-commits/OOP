class BankAccount {
    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    BankAccount(String name, double balance) {
        this.account_holder_name = name;
        this.balance = balance;
    }

    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    void display() {
        System.out.println("Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
    }

    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Kris", 10000);
        BankAccount acc2 = new BankAccount("Raj", 20000);

        acc1.display();
        System.out.println();

        acc2.display();
        System.out.println();

        BankAccount.updateInterestRate(7.0);

        System.out.println("After updating interest rate:");
        acc1.display();
        System.out.println();
        acc2.display();
    }
}
