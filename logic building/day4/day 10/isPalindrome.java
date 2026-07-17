import java.io.*;
import java.util.*;
class UserMainCode {
    public int isPalindrome(String input1){
        String str = input1.toLowerCase();
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return 1; 
            }
            start++;
            end--;
        }
        
        return 2; 
    }
}