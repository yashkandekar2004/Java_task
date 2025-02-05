class Vehicle {
    int maxSpeed;
 
    Vehicle(int speed) {
        this.maxSpeed = speed;
        System.out.println("Vehicle Constructor Called. Max Speed: " + maxSpeed);
    }
}
 
class Car extends Vehicle {
    int maxSpeed;
 
    Car(int speed) {
        super(speed);
        this.maxSpeed = speed;
        System.out.println("Car Constructor Called. Max Speed: " + maxSpeed);
    }
 
    void display() {
        System.out.println("Vehicle Max Speed: " + super.maxSpeed);
        System.out.println("Car Max Speed: " + this.maxSpeed);
    }
}
 
public class Test {
    public static void main(String[] args) {
        Car small = new Car(180);
        small.display();
    }
}
 
 
 