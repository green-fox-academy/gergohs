#include <stdio.h>
#include <stdlib.h>
// Write a program that reads a number from the standard input,
// Then prints "Odd" if the number is odd, or "Even" if it is even.
int main()
{

int num;
printf("Please enter a number: \n");
scanf("%d",&num);

if (num%2==0)
    {
    printf("It's an even");
    } else {
    printf("It'd an odd!");
    }
}
