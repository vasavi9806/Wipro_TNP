public class StringRepeat3 {
    public static String repeatLastN(String str, int n) {
        if (str == null || n <= 0) {
            return "";
        }
        
        // Extract the last n characters
        String target = str.substring(str.length() - n);
        
        // Repeat the target string n times
        return target.repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(repeatLastN("Wipro", 3)); // Output: propropro
    }
}