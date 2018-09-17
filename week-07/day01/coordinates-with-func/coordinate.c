
#include "coordinate.h"
#include <stdio.h>

int arrayFill (Coordinates nameOfArr[])
{
    int max = 100;
    for (int i=0; i<sizeof(nameOfArr)/sizeof(Coordinates); i++)
    {
        nameOfArr[i].x = (rand() % max);
        nameOfArr[i].y = (rand() % max);
        printf("The coordinates of the %d element are: %d, %d \n", i, nameOfArr[i].x, nameOfArr[i].y);
    }
}

