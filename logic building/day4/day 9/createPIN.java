#include<stdio.h>
#include<string.h>
int createPIN(int input1, int input2, int input3) {
    int u1 = input1 % 10;
    int t1 = (input1 / 10) % 10;
    int h1 = (input1 / 100) % 10;
    int u2 = input2 % 10;
    int t2 = (input2 / 10) % 10;
    int h2 = (input2 / 100) % 10;
    
    int u3 = input3 % 10;
    int t3 = (input3 / 10) % 10;
    int h3 = (input3 / 100) % 10;
    
    // Rule 1: Unit (ones) position of PIN is the least of the unit digits
    int pin_u = u1;
    if (u2 < pin_u) pin_u = u2;
    if (u3 < pin_u) pin_u = u3;
    
    // Rule 2: Tens position of PIN is the least of the tens digits
    int pin_t = t1;
    if (t2 < pin_t) pin_t = t2;
    if (t3 < pin_t) pin_t = t3;
    
    // Rule 3: Hundreds position of PIN is the least of the hundreds digits
    int pin_h = h1;
    if (h2 < pin_h) pin_h = h2;
    if (h3 < pin_h) pin_h = h3;
    
    // Rule 4: Thousands position of PIN is the maximum of all the digits in the three inputs
    int pin_th = u1;
    int digits[] = {u1, t1, h1, u2, t2, h2, u3, t3, h3};
    for (int i = 0; i < 9; i++) {
        if (digits[i] > pin_th) {
            pin_th = digits[i];
        }
    }
    
    // Combine to form the 4-digit PIN
    int pin = (pin_th * 1000) + (pin_h * 100) + (pin_t * 10) + pin_u;
    
    return pin;
}