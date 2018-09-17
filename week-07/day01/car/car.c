#include "car.h"

void carStats (Car car)
{
    switch (car.type)
    {
    case TESLA:
        printf("The car has %.1f kms in it. \n", car.km);
        break;
    case TOYOTA:
        printf("The car has %.1f kms in it, and fuel level is %.0f \n", car.km, car.gas);
        break;
    case LAND_ROVER:
        printf("The car has %.1f kms in it, and fuel level is %.0f \n", car.km, car.gas);
        break;
    case VOLVO:
        printf("The car has %.1f kms in it, and fuel level is %.0f \n", car.km, car.gas);
        break;
    }
}
