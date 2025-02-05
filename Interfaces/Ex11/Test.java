public class Test {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        sa.calculateInterest(1000);
        sa.deposit(1000);
        sa.withdraw(500);
    }
}
