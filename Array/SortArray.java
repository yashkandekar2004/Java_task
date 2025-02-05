//write a java program to sort a numeric array and a string array


class SortArray{
    public static void main(String[] args){
        int[] arr = {5, 2, 8, 7, 1};
        int temp = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// class SortArray {
//     public static void main(String[] args) {
//         int[] arr = {5, 2, 8, 7, 1};

//         Arrays.sort(arr); // Using built-in sorting method

//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }