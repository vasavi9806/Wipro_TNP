public class RemoveX {

    public static String withoutX(String str) {
        // Check for empty or null strings
        if (str == null || str.isEmpty()) {
            return str;
        }

        int start = 0;
        int end = str.length();

        // Check first character
        if (str.charAt(0) == 'x') {
            start = 1;
        }

        // Check last character (ensuring we don't double-check a single-char string)
        if (str.length() > 1 && str.charAt(str.length() - 1) == 'x') {
            end = str.length() - 1;
        } else if (str.length() == 1 && str.charAt(0) == 'x') {
            return "";
        }

        return str.substring(start, end);
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "xHix";
        System.out.println("Input: " + input1 + " -> Output: " + withoutX(input1));

        // Example 2
        String input2 = "America";
        System.out.println("Input: " + input2 + " -> Output: " + withoutX(input2));
    }
}