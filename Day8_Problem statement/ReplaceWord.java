public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "The quick brown fox";
        String oldWord = "quick";
        String newWord = "swift";
        String result = replaceWord(sentence, oldWord, newWord);
        System12.out.println("Original: " + sentence);
        System.out.println("Replace \"" + oldWord + "\" with \"" + newWord + "\"");
        System.out.println("Result: " + result);
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) {
                sb.append(newWord);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}