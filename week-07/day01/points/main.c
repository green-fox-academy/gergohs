#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "point.h"

int main()
{
    Point p1 = point_creator(10.0, 20.0);
    Point p2 = point_creator(80.0, 90.0);

    printf("Distance between the two points: %.2f \n", distance_calc(p1, p2));
}
