#include<stdio.h>
#include<string.h>
int lastDigitOf(int input1) {
        if (input1 < 0) {
        input1 = -input1;
    }
    
    return input1 % 10;
}