public class StringCombo {

    public static String comboString(String a, String b) {
        // Handle null inputs safely
        if (a == null) a = "";
        if (b == null) b = "";

        // Compare lengths to determine short and long strings
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        // Test case from assignment
        String str1 = "hi";
        String str2 = "hello";
        
        System.out.println("Inputs: \"" + str1 + "\", \"" + str2 + "\"");
        System.out.println("Output: " + comboString(str1, str2)); 
        // Expected Output: hihellohi
    }
}