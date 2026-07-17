#include<stdio.h>
#include<string.h>
int totalHillWeight(int input1, int input2, int input3) {
    int totalWeight = 0;
    int currentWeight = input2;
    
    for (int i = 1; i <= input1; i++) {
        totalWeight += (i * currentWeight);
        currentWeight += input3;
    }
    
    return totalWeight;
}