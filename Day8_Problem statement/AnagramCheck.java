public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("Are Anagrams: " + isAnagram);
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        int[] count = new int[256];
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}