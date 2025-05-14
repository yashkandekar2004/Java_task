public class LargestRepeatingSubstring {
    static String findLargestRepeatingSubstring(String str) {
        int n = str.length();
        String result = "";
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int length = 0;
                while (j + length < n && str.charAt(i + length) == str.charAt(j + length)) {
                    length++;
                }
                if (length > result.length()) {
                    result = str.substring(i, i + length);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(findLargestRepeatingSubstring("banana"));
    }
}
