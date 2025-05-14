public class MissingNumberinArray {
    void findMissingNumber() {
        int[] arr = { 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum -= arr[i];
        }
        System.out.println("Missing Number: " + sum);
    }

    public static void main(String[] args) {
        MissingNumberinArray obj = new MissingNumberinArray();
        obj.findMissingNumber();
    }
}
