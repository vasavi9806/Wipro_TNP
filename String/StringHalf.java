public class StringHalf {

    public static String getFirstHalf(String str) {
        // Handle edge case where input might be null
        if (str == null) {
            return null;
        }

        // Check if the length of the string is even
        if (str.length() % 2 == 0) {
            // Return the substring from index 0 to length/2
            return str.substring(0, str.length() / 2);
        } else {
            // Return null for odd length string
            return null;
        }
    }

    public static void main(String[] args) {
        // Example 1
        String input1 = "TomCat";
        System.out.println("Input: " + input1);
        System.out.println("Output: " + getFirstHalf(input1)); // Expected: Tom

        System.out.println();

        // Example 2
        String input2 = "Apron";
        System.out.println("Input: " + input2);
        System.out.println("Output: " + getFirstHalf(input2)); // Expected: null
    }
}