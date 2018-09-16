#include <stdio.h>
#include <stdlib.h>
// print the memory address of the variable

int main()
{
    int number = 1234;
    int *pnum = &number;
    printf("Address: %p\n", &number);
}
