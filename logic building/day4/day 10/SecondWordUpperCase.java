import java.io.*;
import java.util.*;
class UserMainCode {
    public String secondWordUpperCase(String input1){
        
        String[] words = input1.trim().split("\\s+");
        
        if (words.length < 2 || words[1].isEmpty()) {
            return "LESS";
        }
        
        return words[1].toUpperCase();
    }
}