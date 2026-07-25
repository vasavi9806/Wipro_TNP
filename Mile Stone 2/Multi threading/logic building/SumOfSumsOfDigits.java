import java.io.*;
import java.util.*;
class UserMainCode {
    public int sumOfSumsOfDigits(int input1) {
        String s = Integer.toString(input1);
        int totalSum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            totalSum += digit * (i + 1);
        }
        return totalSum;
    }