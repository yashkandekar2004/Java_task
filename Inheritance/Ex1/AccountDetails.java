import java.util.Scanner;

class AccountDetails {
    int accNo;
    String name;
    double balance;

    public void addUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        accNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
        System.out.println("User Added Successfully!\n");
    }

    public void viewUser() {
        System.out.println("\nAccount Details:");
        System.out.println("Account No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance + "\n");
    }

    public void checkBalance() {
        System.out.println("Current Balance: " + balance + "\n");
    }
}
