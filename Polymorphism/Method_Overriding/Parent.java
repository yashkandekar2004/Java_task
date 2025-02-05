import java.util.Scanner;

class Parent{
    Scanner sc = new Scanner(System.in);
    public void sum(int a,int b) {
        System.out.println("Sum is "+(a+b));
    }
    void area(){
        System.out.println("Enter radius of circle : ");
        int radius = sc.nextInt();
        System.out.println("Area of circle is "+(3.14*radius*radius));
    }
}


