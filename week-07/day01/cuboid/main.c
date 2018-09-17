// Write a function called "GetSurface" that takes a RectangularCuboid
// and returns it's surface
// Write a function called "GetVolume" that takes a RectangularCuboid
// and returns it's volume

#include <stdio.h>
#include <stdlib.h>
#include "surfacecalc.h"

int main()
{
    RectangularCuboid rect;
    rect.a = 7;
    rect.b = 13;
    rect.c = 19;

    printf("The surface of the rectangle: %.1f\n", getSurface(rect));
    printf("The volume of the rectangle: %.1f\n", getVolume(rect));
}

