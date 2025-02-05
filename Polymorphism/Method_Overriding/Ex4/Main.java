class BankAccount {
    double balance = 5000000;

    void deposit(double amount) {
        balance += amount;  
        System.out.println("Depositing $" + amount);
    }

    void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount);
    }
}

class SavingsAccount extends BankAccount {
    private static final double MAX_WITHDRAWAL = 100000;

    @Override
    void withdraw(double amount) {
        if (amount > MAX_WITHDRAWAL) {
            System.out.println("Savings account withdrawal failed: Limit exceeded ($" + MAX_WITHDRAWAL + ")");
        } else if (amount > balance) {
            System.out.println("Savings account withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount;  // Update balance on withdrawal
            System.out.println("Savings account withdrawing $" + amount);
        }
    }
}

class CurrentAccount extends BankAccount {
    private static final double MAX_WITHDRAWAL = 500000;

    @Override
    void withdraw(double amount) {
        if (amount > MAX_WITHDRAWAL) {
            System.out.println("Current account withdrawal failed: Limit exceeded ($" + MAX_WITHDRAWAL + ")");
        } else if (amount > balance) {
            System.out.println("Current account withdrawal failed: Insufficient balance.");
        } else {
            balance -= amount; 
            System.out.println("Current account withdrawing $" + amount);
        }
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        System.out.println("Initial balance: $" + account.balance);


        System.out.println("========= Savings Account =========");
        account = new SavingsAccount();
        double depositAmount = 1000;
        account.deposit(depositAmount);
        System.out.println("Balance after deposit: $" + account.balance);

        double withdrawalAmount = 90000;
        account.withdraw(withdrawalAmount);
        System.out.println("Balance after withdrawal: $" + account.balance);

        System.out.println("======= Current Account =========");
        account = new CurrentAccount();
        depositAmount = 2000;
        account.deposit(depositAmount);
        System.out.println("Balance after deposit: $" + account.balance);

        withdrawalAmount = 60000;
        account.withdraw(withdrawalAmount);
        System.out.println("Balance after withdrawal: $" + account.balance);
    }
}
