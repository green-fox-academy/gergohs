#ifndef CAR_H_INCLUDED
#define CAR_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>

enum car_type
{
    VOLVO,
    TOYOTA,
    LAND_ROVER,
    TESLA
};

typedef struct {
	enum car_type type;
	double km;
	double gas;
} Car;

void carStats (Car car);


#endif // CAR_H_INCLUDED
