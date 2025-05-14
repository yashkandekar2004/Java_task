import java.util.Scanner;

public class Employee {
    private String name;
    private int hoursWorked;
    private double hourlyRate;

    public void setName(String name) {
        this.name = name;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    void calculateSalary() {
        double salary = hoursWorked * hourlyRate;
        System.out.println("Salary: " + salary);
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Enter name: ");
        e.setName(sc.next());
        System.out.println("Enter hours worked: ");
        e.setHoursWorked(sc.nextInt());
        System.out.println("Enter hourly rate: ");
        e.setHourlyRate(sc.nextDouble());
        e.displayDetails();
        e.calculateSalary();
    }

}
