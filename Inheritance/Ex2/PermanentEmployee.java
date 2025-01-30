import java.util.Scanner;

class PermanentEmployee extends Employee {
    double basicSalary, allowance, pf;
         String grade;
    
        void getData(Scanner sc) {
            super.getData(sc);
            System.out.print("Enter Basic Salary: ");
            basicSalary = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter Grade: ");
            grade = sc.nextLine();
            
        }
    
        double calculateHRA() {
            return basicSalary * 0.20;
        }
    
        double calculateDA() {
            return basicSalary * 0.50;
        }
    
        double calculateGrossSalary() {
            double hra = calculateHRA();
            double da = calculateDA();
            return basicSalary + hra + da + allowance - pf;
        }
        double calculatePF() {
            return basicSalary * 0.11;
        }
    
        double calculateAllowance() {
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


    void printSlip() {
        double hra = calculateHRA();
        double da = calculateDA();
        double pf = calculatePF();
        double allowance=calculateAllowance();
        double grossSalary = calculateGrossSalary();

        System.out.println("\n--- Permanent Employee Salary Slip ---");
        displayData();
        System.out.println("HRA (20% of Basic): " + hra);
        System.out.println("DA (50% of Basic): " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("PF Deduction: " + pf);
        System.out.println("Gross Salary: " + grossSalary);
    }
}
