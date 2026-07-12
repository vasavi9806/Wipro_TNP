import java.io.*;
import java.util.*;
class UserMainCode {
    public int NthPrime(int input1){
        int c = 0;   
        int num = 1;  
        while (c < input1) {
            num++;
            if (isPrime(num)) {
                c++;
            }
        }
        
        return num;
    }
    private boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}