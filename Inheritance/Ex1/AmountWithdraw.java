import java.util.Scanner;

class AmountWithdraw extends AccountDetails {
    public void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        if (balance - amount >= 5000) {  
            balance -= amount;
            System.out.println("Amount Withdrawn Successfully!");
        } else {
            System.out.println("Insufficient Balance! Minimum balance should be 5000.");
        }
        checkBalance();
    }
}
