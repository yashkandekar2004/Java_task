//write a java program to find duplicate values in an array of string


public class FindStringDuplicates {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple",  "banana"};
        
        System.out.println("Duplicate values in the array are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println(arr[i]);
                    break; 
                }
            }
        }
    }
}
