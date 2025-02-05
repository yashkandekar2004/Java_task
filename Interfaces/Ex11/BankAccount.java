public class BankAccount {
    double amount;

    BankAccount(double amount) {
        this.amount = amount;
    }

    void deposit(double amount) {
        this.amount += amount;  
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + this.amount);
    }

    void withdraw(double amount) {
        if (amount > this.amount) {
            System.out.println("Insufficient balance!");
        } else {
            this.amount -= amount;  
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + this.amount);
        }
    }
}
