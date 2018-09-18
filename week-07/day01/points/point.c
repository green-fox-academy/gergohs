#include "point.h"

Point point_creator(float x, float y)
{
    Point p;
    p.x = x;
    p.y = y;

    return p;
}

double distance_calc (Point point1, Point point2)
{
    double distance = sqrt(((point2.x-point1.x) * (point2.x-point1.x)) + ((point2.y-point1.y)*(point2.y-point1.y)));

    return distance;
}
