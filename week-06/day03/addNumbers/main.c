#include <stdio.h>
#include <stdlib.h>
//Add two numbers using pointers
int main()
{

    int a = 10;
    int b = 20;
    int* pointer_a = &a;
    int* pointer_b = &b;

    printf("Sum : %d\n", *pointer_a + *pointer_b);

}
