#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i;
    int j;
    int *counter;
    printf("How many rows would you like?\n");
    scanf("%d",&counter);
    printf("Here is the %d row sized triangle: \n", counter);

    for (i = 1; i <= counter; i++) {
        for (j = 1; j <= i; j++)
        {
            printf("%d ", j);
        }
        printf(" \n");
    }
}
