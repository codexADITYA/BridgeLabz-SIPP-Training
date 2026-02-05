public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "hello";
        String result = removeDuplicates(str);
        System.out.println("Original: " + str);
        System.out.println("Without Duplicates: " + result);
    }

    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        boolean[] seen = new boolean[256];
        for (char ch : str.toCharArray()) {
            if (!seen[ch]) {
                sb.append(ch);
                seen[ch] = true;
            }
        }
        return sb.toString();
    }
}