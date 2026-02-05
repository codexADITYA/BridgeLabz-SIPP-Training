public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "radar";
        boolean isPalindrome = isPalindrome(str);
        System.out.println("String: " + str);
        System.out.println("Is Palindrome: " + isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}