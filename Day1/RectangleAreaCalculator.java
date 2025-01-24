public class RectangleAreaCalculator {

    // First approach: Calculate area with parameters and return result
    double calculateAreaWithParameters(double length, double width) {
        return length * width;
    }

    // Second approach: Calculate area without return (just print the result)
    void calculateAreaWithoutReturn() {
        double length = 5.0;
        double width = 3.0;
        double area = length * width;
        System.out.println("Area of rectangle (without return): " + area);
    }

    // Third approach: Calculate area with parameters and print the result
    void calculateAreaWithParametersNoReturn(double length, double width) {
        double area = length * width;
        System.out.println("Area of rectangle (with parameters, no return): " + area);
    }

    // Fourth approach: Calculate area without parameters and return result
    double calculateAreaWithoutParameters() {
        double length = 7.0;
        double width = 4.0;
        return length * width;
    }

    public static void main(String[] args) {
        RectangleAreaCalculator calculator = new RectangleAreaCalculator();

        // Test First Approach: calculate area with parameters and return result
        double length1 = 6.0;
        double width1 = 3.0;
        double area1 = calculator.calculateAreaWithParameters(length1, width1);
        System.out.println("Area of rectangle (first approach): " + area1);

        // Test Second Approach: calculate area without return (print the result)
        calculator.calculateAreaWithoutReturn();

        // Test Third Approach: calculate area with parameters and print result
        double length2 = 8.0;
        double width2 = 2.0;
        calculator.calculateAreaWithParametersNoReturn(length2, width2);

        // Test Fourth Approach: calculate area without parameters and return result
        double area4 = calculator.calculateAreaWithoutParameters();
        System.out.println("Area of rectangle (fourth approach): " + area4);
    }
}
