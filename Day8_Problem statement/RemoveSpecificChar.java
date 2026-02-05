public class RemoveSpecificChar {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'l';
        String result = removeChar(str, ch);
        System.out.println("Original: " + str);
        System.out.println("Character to Remove: '" + ch + "'");
        System.out.println("Modified String: \"" + result + "\"");
    }

    public static String removeChar(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != ch) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}