public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int largest = numbers[0];
        int secondLargest = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest) {
                secondLargest = numbers[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }
}
