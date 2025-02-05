public class Ex10 {
    void calculateVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the string: " + count);
    }
    public static void main(String[] args) {
        Ex10 obj = new Ex10();
        obj.calculateVowels("programming");
    }
}
