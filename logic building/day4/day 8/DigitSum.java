import java.io.*;
import java.util.*;

class userMainCode {
    public int digitSum(int input1) {
        long num = input1;
        boolean isNegative = false;
        
        if (num < 0) {
            isNegative = true;
            num = -num;
        }
        while (num >= 10) {
            long sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return isNegative ? -(int)num : (int)num;
    }
}