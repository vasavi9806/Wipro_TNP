import java.io.*;
import java.util.*;

class UserMainCode {
    public class Results {
        public final int output1;
        public final int output2;

        public Result(int out1, int out2) {
            output1 = out1;
            output2 = out2;
        }
    }

    public Results findOriginalFirstAndSum(int[] input1, int input2) {
        int[] ori = new int[input2];

        ori[input2 - 1] = input1[input2 - 1];

        for (int i = input2 - 2; i >= 0; i--) {
            ori[i] = input1[i] - ori[i + 1];
        }

        int sum = 0;
        for (int val : ori) {
            sum += val;
        }

        return new Result(ori[0], sum);
    }
}