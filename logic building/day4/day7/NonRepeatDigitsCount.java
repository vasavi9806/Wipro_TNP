import java.io.*;
import java.util.*;
class UserMainCode {
    public int nonRepeatDigitsCount(int input1){
        int[] count = new int[10];
        while (input1 > 0) {
            int digit = input1 % 10;
            count[digit]++;
            input1 /= 10;
        }
        int nonRepeatedCount = 0;
        for (int i = 0; i < 10; i++) {
            if (count[i] == 1) {
                nonRepeatedCount++;
            }
        }
        
        return nonRepeatedCount;
    }
}