#include <stdio.h>
#include <stdlib.h>
//Print out the addresses with and without pointer
//print out the values with and without pointer
int main()
{
    int number = 2017;
    float Pi = 3.14;
    char letter = 't';

    int* numberPointer = &number;
    float* PiPointer = &Pi;
    char* letterPointer = &letter;

    printf("\n******************Number address and value******************\n\n");

    printf("Address of the number with pointer: %d\n", numberPointer);
    printf("Address of the number without pointer: %d\n", &number);

    printf("Value of the number with pointer: %d\n", *numberPointer);
    printf("Value of the number without pointer: %d\n", number);

    printf("\n******************Pi address and value******************\n\n");

    printf("Address of the Pi with pointer: %d\n", PiPointer);
    printf("Address of the Pi without pointer: %d\n", &Pi);

    printf("Value of the Pi with pointer: %.2f\n", *PiPointer);
    printf("Value of the Pi without pointer: %.2f\n", Pi);

    printf("\n******************Letter address and value******************\n\n");

    printf("Address of the char with pointer: %d\n", letterPointer);
    printf("Address of the char without pointer: %d\n", &letter);

    printf("Value of the char with pointer: %c\n", *letterPointer);
    printf("Value of the char without pointer: %c\n", letter);

    printf("\n**********************************************************\n\n");

}
