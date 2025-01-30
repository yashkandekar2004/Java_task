import java.util.Scanner;

class AmountDeposit extends AccountDetails {
    public void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Deposit Amount: ");
        double amount = sc.nextDouble();
        balance += amount;
        System.out.println("Amount Deposited Successfully!");
        checkBalance();
    }
}
