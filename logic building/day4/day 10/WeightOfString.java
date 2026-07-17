import java.io.*;
import java.util.*;
class UserMainCode {
    public int weightOfString(String input1, int input2){
        int totalWeight = 0;
        String str = input1.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                boolean isVowel = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
                
                if (input2 == 0 && isVowel) {
                    continue;
                }
                
                int weight = ch - 'a' + 1;
                totalWeight += weight;
            }
        }
        
        return totalWeight;
    }
}