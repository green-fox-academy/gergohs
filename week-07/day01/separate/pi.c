#include "pi.h"

float areaCalc (float sampleCircle)
{
    float area = sampleCircle * sampleCircle * PI;
    return area;
}

float circFerCalc (float sampleCircle)
{
    float circumference = 2 * sampleCircle * PI;
    return circumference;
}

