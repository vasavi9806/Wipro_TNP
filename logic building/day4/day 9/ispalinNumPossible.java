import java.io.*;
import java.util.*;
class UserMainCode {
    public int ispalinNumPossible(int input1) {
        int[] counts = new int[10];
        
        int temp = input1;
        while (temp > 0) {
            int digit = temp % 10;
            counts[digit]++;
            temp /= 10;
        }
        int oddCount = 0;
        for (int i = 0; i < 10; i++) {
            if (counts[i] % 2 != 0) {
                oddCount++;
            }
        }
        if (oddCount <= 1) {
            return 2; 
        } else {
            return 1; 
        }
    }
}