/*Continue working on the pi.c project

Organise the function from the previous excercise to separate .c and .h files
Create another function which calculates the circumference of a circle
the radius of the circle should be passed as a parameter
the function should return the calculated circumference
circumference = 2 * radius * PI
this function should be in the same .c and .h files as the one which calculates the area
*/

#include <stdio.h>
#include <stdlib.h>
#include "pi.h"

float circFerCalc (int radius);

int main()
{
    int sampleCircle = 6;
    circFerCalc(sampleCircle);
}

float circFerCalc (int radius)
{
    float circumference = 2 * (float)radius * PI;
    return printf("%.2f", circumference);
}
