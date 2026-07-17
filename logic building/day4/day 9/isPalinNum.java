import java.io.*;
import java.util.*;
class UserMainCode {
    public int isPalinNum(int input1) {
        int original = input1;
        int reversed = 0;
        int temp = input1;
        
        while (temp > 0) {
            int digit = temp % 10;
            reversed = (reversed * 10) + digit;
            temp /= 10;
        }
        if (original == reversed) {
            return 2; 
        } else {
            return 1;
        }
    }
}