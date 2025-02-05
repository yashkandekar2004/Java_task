class Vehicle {
    int speed = 0;

    void speedUp() {
        speed += 10;
        System.out.println("Vehicle speed: " + speed );
    }
}

class Car extends Vehicle {
    void speedUp() {
        speed += 20;
        System.out.println("Car speed: " + speed);
    }
}

class Bicycle extends Vehicle {
    void speedUp() {
        speed += 5;
        System.out.println("Bicycle speed: " + speed );
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        vehicle.speedUp();

        vehicle = new Car();
        vehicle.speedUp();

        vehicle = new Bicycle();
        vehicle.speedUp();
    }
}
