class Vehicle {
    String model;
    int year;

    Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    void drive() {
        System.out.println("Vehicle is moving");
    }

    void display() {
        System.out.println("Model: " + model + " Year: " + year);
    }
}