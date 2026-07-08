#include<stdio.h>
#include<string.h>
int secondLastDigitOf(int input1) {
    if (input1 < 0) {
        input1 = -input1;
    }
    if (input1 >= 0 && input1 <= 9) {
        return -1;
    }
    return (input1 / 10) % 10;
}