#include <stdio.h>
#include <stdlib.h>
// Write a program that asks for two numbers and prints the bigger one

int main()
{
int a;
int b;

printf("Please enter two numbers: \n");
scanf("%d %d", &a, &b);

if(a>b){
    printf("%d\n",a);
    } else {printf("%d", b);
    }
}
