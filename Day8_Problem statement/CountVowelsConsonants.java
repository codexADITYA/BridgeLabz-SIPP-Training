public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "Hello World";
        int[] counts = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }
}