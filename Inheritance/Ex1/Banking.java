import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AmountDeposit user = new AmountDeposit(); 
        AmountWithdraw withdrawUser = new AmountWithdraw();

        while (true) {
            System.out.println("\n--- Banking System Menu ---");
            System.out.println("1. Add New User");
            System.out.println("2. Display User Information");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Withdraw Amount");
            System.out.println("5. Check Account Balance");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    user.addUser();
                    withdrawUser.accNo = user.accNo; 
                    withdrawUser.name = user.name;
                    withdrawUser.balance = user.balance;
                    break;
                case 2:
                    user.viewUser();
                    break;
                case 3:
                    user.deposit();
                    withdrawUser.balance = user.balance; 
                    break;
                case 4:
                    withdrawUser.withdraw();
                    user.balance = withdrawUser.balance; 
                    break;
                case 5:
                    user.checkBalance();
                    break;
                case 6:
                    System.out.println("Exiting Banking System...");
                    return;
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        }
    }
}
