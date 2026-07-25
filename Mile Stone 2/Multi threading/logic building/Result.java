import java.io.*;
import java.util.*;
class UserMainCode{
    public class Result{
        public final int output1;
        public final int output2;
        public Result(int out1, int out2){
            output1=out1;
            output2=out2;
        }
    }
    public Result decreasingSeq(int[] input1,int input2){
        int c=0;
        int ml=0;
        int cl=0;
        for(int i=0;i<input2-1;i++){
            if(input1[i]>input1[i+1]){
                cl++;
            }else{
                if(cl>1){
                    c++;
                    if(cl>ml){
                        ml=cl;
                    }
                    cl=1;
                }
            }
        }
        if(cl>1){
            c++;
            if(cl>ml){
                ml=cl;
            }
        }
        return new Result(c,ml);
    }
    }