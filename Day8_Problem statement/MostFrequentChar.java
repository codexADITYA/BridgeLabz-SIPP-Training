public class MostFrequentChar {
    public static void main(String[] args) {
        String str = "success";
        char result = findMostFrequentChar(str);
        System.out.println("String: " + str);
        System.out.println("Most Frequent Character: '" + result + "'");
    }

    public static char findMostFrequentChar(String str) {
        int[] count = new int[256];
        int maxCount = 0;
        char result = ' ';
        for (char ch : str.toCharArray()) {
            count[ch]++;
            if (count[ch] > maxCount) {
                maxCount = count[ch];
                result = ch;
            }
        }
        return result;
    }
}