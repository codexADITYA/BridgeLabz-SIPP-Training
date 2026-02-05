public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello World";
        String reversed = reverseString(str);
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}