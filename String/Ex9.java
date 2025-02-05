public class Ex9 {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(input.charAt(i)) == -1) {
                result += input.charAt(i);
            }
        }

        System.out.println("String without duplicates: " + result);
    }
}
