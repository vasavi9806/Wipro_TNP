import java.io.*;
import java.util.*;
class UserMainCode3 {
    public int nFactorial(int input1){
        int factorial = 1;
        for (int i = 1; i <= input1; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}