public class CircleAreaCalculator {
    // First Approach
    double calculateAreaWithParameter(double radius) {
        double pi = 3.14;
        return pi * radius * radius;
    }

    // second approach
    void calculateAreaWithoutReturn() {
        double radius = 5.0;
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of circle : " + area);
    }

    // third approach
    void calculateAreaWithParameterNoReturn(double radius) {
        double pi = 3.14;
        double area = pi * radius * radius;
        System.out.println("Area of circle : " + area);
    }

    // fourth approach
    double calculateAreaWithoutParameter() {
        double radius = 7.0;
        double pi = 3.14;
        return pi * radius * radius;
    }

    public static void main(String[] args) {
        CircleAreaCalculator calculator = new CircleAreaCalculator();
        double radius1 = 6.0;
        double area1 = calculator.calculateAreaWithParameter(radius1);
        System.out.println("Area of circle : " + area1);

        calculator.calculateAreaWithoutReturn();

        double radius2 = 8.0;
        calculator.calculateAreaWithParameterNoReturn(radius2);

        double area4 = calculator.calculateAreaWithoutParameter();
        System.out.println("Area of circle : " + area4);
    }
}
