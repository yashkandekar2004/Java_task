import java.util.Scanner;

class Company {
    String compName, compAddress, compEmail, compContact;

    void getData(Scanner sc) {
        System.out.print("Enter Company Name: ");
        compName = sc.nextLine();
        System.out.print("Enter Company Address: ");
        compAddress = sc.nextLine();
        System.out.print("Enter Company Email: ");
        compEmail = sc.nextLine();
        System.out.print("Enter Company Contact: ");
        compContact = sc.nextLine();
    }

    void displayData() {
        System.out.println("\nCompany Details:");
        System.out.println("Name: " + compName);
        System.out.println("Address: " + compAddress);
        System.out.println("Email: " + compEmail);
        System.out.println("Contact: " + compContact);
    }
}