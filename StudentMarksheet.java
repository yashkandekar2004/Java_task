import java.util.Scanner;

class StudentMarksheet {
    private String name;
    private int rollNumber;
    private float marks1, marks2, marks3, marks4, marks5, marks6;

    public void inputDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();

        System.out.print("Enter Marks in Subject 1: ");
        marks1 = scanner.nextFloat();

        System.out.print("Enter Marks in Subject 2: ");
        marks2 = scanner.nextFloat();

        System.out.print("Enter Marks in Subject 3: ");
        marks3 = scanner.nextFloat();

        System.out.print("Enter Marks in Subject 4: ");
        marks4 = scanner.nextFloat();

        System.out.print("Enter Marks in Subject 5: ");
        marks5 = scanner.nextFloat();

        System.out.print("Enter Marks in Subject 6: ");
        marks6 = scanner.nextFloat();
    }

    public void displayMarksheet() {
        float total = marks1 + marks2 + marks3 + marks4 + marks5 + marks6;
        float average = total / 6;

        System.out.println("--- Marksheet ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: ");
        System.out.println("  Subject 1: " + marks1);
        System.out.println("  Subject 2: " + marks2);
        System.out.println("  Subject 3: " + marks3);
        System.out.println("  Subject 4: " + marks4);
        System.out.println("  Subject 5: " + marks5);
        System.out.println("  Subject 6: " + marks6);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);

        String grade;
        if (average >= 85) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "Fail";
        }
        System.out.println("Grade: " + grade);
    }


    public static void main(String[] args) {
        StudentMarksheet student = new StudentMarksheet();
        student.inputDetails();
        student.displayMarksheet();
    }
}
