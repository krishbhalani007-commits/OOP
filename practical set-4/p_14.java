class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    void openAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance =balance+amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance =balance- amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingAccount extends BankAccount {
    double calculateInterest(double rate) {
        return (balance * rate) / 100;
    }
}

class FixedDepositAccount extends BankAccount {
    double maturityAmount(double rate, int years) {
        return balance * Math.pow(1 + rate / 100, years);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.openAccount("101", "Kris", 10000);
        sa.deposit(2000);
        sa.withdraw(1500);
        sa.checkBalance();
        System.out.println("Saving Interest: " + sa.calculateInterest(5));

        System.out.println();

        FixedDepositAccount fd = new FixedDepositAccount();
        fd.openAccount("102", "Raj", 20000);
        fd.checkBalance();
        System.out.println("Maturity Amount: " + fd.maturityAmount(6, 3));
    }
}
