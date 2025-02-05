//write a java program to calculate average value of array elements


public class AverageArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = sum / numbers.length;
        System.out.println("The average is: " + average);
    }
}
