public class StringUtil {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello"));  // Output: "olleH"
    }
}