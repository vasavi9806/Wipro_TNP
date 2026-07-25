import java.io.*;
import java.util.*;
class UserMainCode {
    public int sumOfPowerOfDigits(int input1) {
        String s = String.valueOf(input1);
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int base = s.charAt(i) - '0';
            int exponent = s.charAt(i + 1) - '0';
            sum += (int) Math.pow(base, exponent);
        }
        int lastDigit = s.charAt(s.length() - 1) - '0';
        sum += (int) Math.pow(lastDigit, 0);
        return sum;
    }
}