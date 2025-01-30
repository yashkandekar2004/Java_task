import java.util.Scanner;

class Employee extends Company {
    int empId;
    String empName, contact, department;

    void getData(Scanner sc) {
        super.getData(sc);
        System.out.print("\nEnter Employee ID: ");
        empId = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Contact: ");
        contact = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    void displayData() {
        super.displayData();
        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Contact: " + contact);
        System.out.println("Department: " + department);
    }
}
