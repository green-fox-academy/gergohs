#ifndef SURFACECALC_H_INCLUDED
#define SURFACECALC_H_INCLUDED

typedef struct
{
    int a;
    int b;
    int c;

} RectangularCuboid;

float getSurface(RectangularCuboid cuboid);

float getVolume (RectangularCuboid cuboid);

#endif // SURFACECALC_H_INCLUDED
