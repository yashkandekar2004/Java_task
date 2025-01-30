import java.util.Scanner;

class TemporaryEmployee extends Employee {
    double wagePerDay;
    int presentDays;

    void getData(Scanner sc) {
        super.getData(sc);
        System.out.print("Enter Wage Per Day: ");
        wagePerDay = sc.nextDouble();
        System.out.print("Enter Number of Present Days: ");
        presentDays = sc.nextInt();
    }

    void printSlip() {
        double totalSalary = wagePerDay * presentDays;

        System.out.println("\n--- Temporary Employee Salary Slip ---");
        displayData();
        System.out.println("Wage Per Day: " + wagePerDay);
        System.out.println("Days Present: " + presentDays);
        System.out.println("Total Salary: " + totalSalary);
    }
}