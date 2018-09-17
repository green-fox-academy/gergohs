#include "surfacecalc.h"

float getSurface(RectangularCuboid cuboid)
{

    float surface = 2* (cuboid.a*cuboid.b+cuboid.a*cuboid.c+cuboid.b*cuboid.c);
    return surface;
}

float getVolume (RectangularCuboid cuboid)
{
    float volume = (cuboid.a*cuboid.b*cuboid.c);
    return volume;
}
