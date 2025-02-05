public class TestCar extends Vehicle implements SelfDriving, ElectricVehicle {
    public TestCar(String model, int year) {
        super(model, year);
    }

    public void navigate() {
        System.out.println("Self-driving mode activated");
    }

    public void chargeBattery() {
        System.out.println("Battery charging...");
    }

    public static void main(String[] args) {
        TestCar myCar = new TestCar("Toyota", 2010);
        myCar.display();
        myCar.navigate();
        myCar.chargeBattery();
    }

}