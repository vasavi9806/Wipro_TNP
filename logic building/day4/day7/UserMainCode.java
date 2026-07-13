import java.io.*;
import java.util.*;
class UserMainCode {
    public int uniqueDigitsCount(int input1){
        
        boolean[] visited = new boolean[10];
        int uniqueCount = 0;
        if (input1 == 0) {
            return 1;
        }
        
        while (input1 > 0) {
            int digit = input1 % 10;
            if (!visited[digit]) {
                visited[digit] = true;
                uniqueCount++;
            }
            input1 /= 10;
        }
        
        return uniqueCount;
    }
}