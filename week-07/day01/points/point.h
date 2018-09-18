#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#ifndef POINT_H_INCLUDED
#define POINT_H_INCLUDED

typedef struct
{
    float x;
    float y;
} Point;

Point point_creator(float x, float y);

double distance_calc (Point point1, Point point2);

#endif // POINT_H_INCLUDED
