public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        
        String[] strArr1 = {"apple", "banana", "cherry"};
        String[] strArr2 = {"banana", "cherry", "date"};

        System.out.println("Common elements in the integer arrays are:");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }

        System.out.println("\nCommon elements in the string arrays are:");
        for (int i = 0; i < strArr1.length; i++) {
            for (int j = 0; j < strArr2.length; j++) {
                if (strArr1[i].equals(strArr2[j])) {
                    System.out.println(strArr1[i]);
                    break;
                }
            }
        }
    }
}
