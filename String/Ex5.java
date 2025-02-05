public class Ex5 {
    public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java!";
        String subStr = "welcome";

        if (str.contains(subStr)) {
            System.out.println("The string contains the substring.");
        } else {
            System.out.println("The string does not contain the substring.");
        }
    }
}
