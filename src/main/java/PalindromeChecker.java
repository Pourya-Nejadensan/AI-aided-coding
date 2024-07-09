public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("anna"));  // Output: true
        System.out.println(isPalindrome("hello")); // Output: false
    }
}