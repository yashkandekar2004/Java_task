public class SimpleInterestCalculator {

    // First Approach
    double calculateSimpleInterestWithParameters(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Second Approach
    void calculateSimpleInterestWithoutReturn() {
        double principal = 1000.0;
        double rate = 5.0;
        double time = 2.0;
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest : " + interest);
    }

    // Third Approach
    void calculateSimpleInterestWithParametersNoReturn(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest : " + interest);
    }

    // Fourth Approach
    double calculateSimpleInterestWithoutParameters() {
        double principal = 1500.0;
        double rate = 4.0;
        double time = 3.0;
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SimpleInterestCalculator calculator = new SimpleInterestCalculator();

        // First approach
        double principal1 = 2000.0;
        double rate1 = 6.0;
        double time1 = 3.0;
        double interest1 = calculator.calculateSimpleInterestWithParameters(principal1, rate1, time1);
        System.out.println("Simple Interest : " + interest1);

        // Second approach
        calculator.calculateSimpleInterestWithoutReturn();

        // Third approach
        double principal2 = 1200.0;
        double rate2 = 7.0;
        double time2 = 4.0;
        calculator.calculateSimpleInterestWithParametersNoReturn(principal2, rate2, time2);

        // Fourth approach
        double interest4 = calculator.calculateSimpleInterestWithoutParameters();
        System.out.println("Simple Interest : " + interest4);
    }
}
