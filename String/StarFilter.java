public class StarFilter {

    public static String starDrop(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder sb = new StringBuilder();
        int len = str.length();

        for (int i = 0; i < len; i++) {
            // Check if current char is '*'
            if (str.charAt(i) == '*') {
                continue;
            }
            // Check if left neighbor is '*'
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            // Check if right neighbor is '*'
            if (i < len - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

            // If neither the char nor its neighbors are '*', keep it
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Example from assignment
        String input = "ab*cd";
        System.out.println("Input:  " + input);
        System.out.println("Output: " + starDrop(input)); // Expected: ad
        
        // Additional edge case test
        String input2 = "abc*xyz";
        System.out.println("Input:  " + input2);
        System.out.println("Output: " + starDrop(input2)); // Expected: abyz
    }
}