public class LongestWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps";
        String longest = findLongestWord(sentence);
        System.out.println("Sentence: " + sentence);
        System.out.println("Longest Word: " + longest);
    }

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}