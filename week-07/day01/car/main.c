
#include "car.h"

int main()
{

    Car myCar;
    myCar.km = 20000.0;
    myCar.gas = 80.0;
    myCar.type = VOLVO;

    Car yourCar;
    yourCar.km = 10000.0;
    yourCar.type = TESLA;


    carStats(myCar);
    carStats(yourCar);
}
