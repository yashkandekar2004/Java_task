import java.util.Scanner;

public class Employee {
    Scanner scanner = new Scanner(System.in);
    String companyName, companyAddress;
    String employeeName, employeeAddress, employeeGrade, employeeDesignation;
    int pinCode, basicSalary;

    Employee() {
        companyName = "The Baap Company";
        companyAddress = "Paregaon, Ahilyanagar, MH, IND";
    }

    public void getEmployeeDetails() {
        System.out.print("Enter Employee Name: ");
        employeeName = scanner.nextLine();

        System.out.print("Enter Employee Address: ");
        employeeAddress = scanner.nextLine();

        System.out.print("Enter PIN Code: ");
        pinCode = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Grade (A/B/C): ");
        employeeGrade = scanner.nextLine();

        System.out.print("Enter Designation: ");
        employeeDesignation = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        basicSalary = scanner.nextInt();
    }

    float calculateDA(int salary) {
        return salary * 0.5f;
    }

    float calculateHRA(int salary) {
        return salary * 0.2f;
    }

    float calculatePF(int salary) {
        return salary * 0.11f;
    }

    float calculateAllowance(String grade) {
        switch (grade.toUpperCase()) {
            case "A":
                return 1700f;
            case "B":
                return 1500f;
            case "C":
                return 1300f;
            default:
                return 0f;
        }
    }

    float calculateGrossSalary() {
        float da = calculateDA(basicSalary);
        float hra = calculateHRA(basicSalary);
        float pf = calculatePF(basicSalary);
        float allowance = calculateAllowance(employeeGrade);

        return basicSalary + da + hra + allowance - pf;
    }

    public void displayEmployeeDetails() {
        System.out.println(" ");
        System.out.println("========= Employee Details =========");
        System.out.println("Company Name    : " + companyName);
        System.out.println("Company Address : " + companyAddress);
        System.out.println("-----------------------------------");
        System.out.println("Employee Name   : " + employeeName);
        System.out.println("Employee Address: " + employeeAddress);
        System.out.println("PIN Code        : " + pinCode);
        System.out.println("Grade           : " + employeeGrade);
        System.out.println("Designation     : " + employeeDesignation);
        System.out.println("Basic Salary    : " + basicSalary);
        System.out.println("-----------------------------------");
        System.out.println("DA (50%)        : " + calculateDA(basicSalary));
        System.out.println("HRA (20%)       : " + calculateHRA(basicSalary));
        System.out.println("PF (11%)        : " + calculatePF(basicSalary));
        System.out.println("Allowance       : " + calculateAllowance(employeeGrade));
        System.out.println("-----------------------------------");
        System.out.println("Gross Salary    : " + calculateGrossSalary());
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getEmployeeDetails();
        employee.displayEmployeeDetails();
    }
}
