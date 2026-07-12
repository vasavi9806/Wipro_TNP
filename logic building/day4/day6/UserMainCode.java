import java.io.*;
import java.util.*;
class UserMainCode {
    public long nthFibonacci(int input1){
        if (input1 == 1) {
            return 0;
        }
        if (input1 == 2) {
            return 1;
        }
        long prev2 = 0; 
        long prev1 = 1; 
        long current = 0;
        for (int i = 3; i <= input1; i++) {
            current = prev1 + prev2;
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }
}