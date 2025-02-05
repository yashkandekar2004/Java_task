//write a java program to find maximum and minimum value of an array


public class MaxMinArray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
        int max = num[0];
        int min = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
