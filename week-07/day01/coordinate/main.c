#include <stdio.h>
#include "coordinates.h"

// Create a struct to store coordinates (for example: int x and int y)
// Create an array which can store coordinates, do not create multidimensonal arrays here
// Fill up the coordinates in the array with random number.

int main()
{
    Coordinates coordinateArr[20];

    int max = 101;
    for (int i=0; i<sizeof(coordinateArr)/sizeof(Coordinates); i++)
    {
        coordinateArr[i].x = (rand() % max+1);
        coordinateArr[i].y = (rand() % max+1);
        printf("The coordinates of the %d element are: %d, %d \n", i, coordinateArr[i].x, coordinateArr[i].y);
    }
}
