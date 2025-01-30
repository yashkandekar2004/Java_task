import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter details for Permanent Employee:");
        PermanentEmployee pEmp = new PermanentEmployee();
        pEmp.getData(sc);
        pEmp.printSlip();

        sc.nextLine(); 

        System.out.println("\nEnter details for Temporary Employee:");
        TemporaryEmployee tEmp = new TemporaryEmployee();
        tEmp.getData(sc);
        tEmp.printSlip();
  
        sc.close();
    }
}