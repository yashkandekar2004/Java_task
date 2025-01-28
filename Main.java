class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Yash Kandekar", 21);
        Student student2 = new Student(student1); 
        student1.display();
        student2.display();
    }
}
