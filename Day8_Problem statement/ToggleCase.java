public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World";
        String toggled = toggleCase(str);
        System.out.println("Original: " + str);
        System.out.println("Toggled: " + toggled);
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                sb.append(Character.toUpperCase(ch));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}