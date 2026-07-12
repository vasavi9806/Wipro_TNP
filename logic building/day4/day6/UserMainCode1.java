import java.io.*;
import java.util.*;
class UserMainCode1 {
    public int isPrime(int input1){
        if (input1 < 2) {
            return 1; 
        }
        for (int i = 2; i * i <= input1; i++) {
            if (input1 % i == 0) {
                return 1;
            }
        }
        
        return 2; 
    }
}