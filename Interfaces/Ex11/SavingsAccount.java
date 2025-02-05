public class SavingsAccount extends BankAccount implements InterestBearing {
    SavingsAccount(double amount) {
        super(amount);
    }

    public void calculateInterest(double interestRate) {
        double interest = this.amount * interestRate / 100; 
        this.amount += interest; 
        System.out.println("Interest Earned: " + interest);
        System.out.println("Updated Balance: " + this.amount);
    }


}
