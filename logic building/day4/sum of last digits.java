#include<stdio.h>
#include<string.h>
int addLastDigits(int input1, int input2) {
    if (input1 < 0) {
        input1 = -input1;
    }
    if (input2 < 0) {
        input2 = -input2;
    }
        return (input1 % 10) + (input2 % 10);
}