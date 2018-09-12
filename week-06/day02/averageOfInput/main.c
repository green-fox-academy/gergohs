#include <stdio.h>
#include <stdlib.h>
// Write a program that asks for 5 integers in a row,
// then it should print the sum and the average of these numbers like:
// Sum: 22, Average: 4

int main()
{
    int a;
    int b;
    int c;
    int d;
    int e;

    printf("Please enter 5 numbers: \n");
    scanf("%d %d %d %d %d", &a, &b, &c, &d, &e);
    printf("Sum: %d, Average: %.2f \n", a+b+c+d+e, (float)(a+b+c+d+e)/5);

}
