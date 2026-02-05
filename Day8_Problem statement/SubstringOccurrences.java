public class SubstringOccurrences {
    public static void main(String[] args) {
        String str = "hello hello world";
        String sub = "hello";
        int count = countSubstring(str, sub);
        System.out.println("String: " + str);
        System.out.println("Substring: " + sub);
        System.out.println("Occurrences: " + count);
    }

    public static int countSubstring(String str, String sub) {
        if (sub.length() == 0) return 0;
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += 1;
        }
        return count;
    }
}