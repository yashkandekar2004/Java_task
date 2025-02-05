package Ex6;

public class Addition {
    public static void main(String[] args) {
        Parent p1;
 
        p1 = new Parent();
        p1.sum();
 
        p1 = new Child1();
        p1.sum();
 
        p1 = new Child2();
        p1.sum();
    }
 
}
 
class Parent {
    void sum() {
        int a = 10, b = 10;
        int c = a + b;
        System.out.println("Int Sum = " + c);
    }
}
 
class Child1 extends Parent {
    void sum() {
        float a = 1.5f, b = 2.5f;
        float c = a + b;
        System.out.println("Float Sum = " + c);
    }
 
}
 
class Child2 extends Parent {
    void sum() {
        char a = 'a', b = 'b';
        float c = a + b;
        System.out.println("Char Sum = " + c);
    }
}
 
 