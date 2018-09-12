// Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

#include <stdio.h>
#include <stdlib.h>

int main()
{
    int size;
    printf("Please give the size of the triangle: ");
    scanf("%d", &size);

    for (int i = 0; i <=size; i++)
    {
        for (int j = 0; j<i; j++)
        {
            printf("*");
        }
        printf("\n");
    }

}
