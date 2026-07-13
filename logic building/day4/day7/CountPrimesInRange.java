import java.io.*;
import java.util.*;
class UserMainCode {
    public int countPrimesInRange(int input1, int input2){
        int primeCount = 0;
        
        for (int i = input1; i <= input2; i++) {
            if (isPrime(i)) {
                primeCount++;
            }
        }
        
        return primeCount;
    }
    private boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}