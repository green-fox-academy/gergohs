// define a variable called PI with the value of 3.14
// create a function which takes the radius of a circle as a parameter
// and return the area of that cirle
// area = radius * radius * PI

#include <stdio.h>
#include <stdlib.h>
#define PI  3.14;

float areaCalc (float radius);

int main()
{
    int sampleCircle = 5;
    areaCalc(sampleCircle);
}

float areaCalc (float radius)
{
    float area = (float)radius * radius * PI;
    return printf("%.2f", area);
}
