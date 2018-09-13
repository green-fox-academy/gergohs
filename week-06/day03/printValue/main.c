#include <stdio.h>
#include <stdlib.h>

int main()
{
    int number = 1234;
    int* number_pointer = &number;

    printf("Value: %d\n", *number_pointer);

}
