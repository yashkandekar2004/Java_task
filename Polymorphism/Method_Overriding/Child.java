public class Child extends Parent {
    public void div(int a,int b) {
        System.out.println("Division is : "+(a/b));
    }
    public void area(){
        System.out.println("Enter length of rectangle : ");
        int length = sc.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int breadth = sc.nextInt();
        System.out.println("Area of rectangle is "+(length*breadth));
    }
}