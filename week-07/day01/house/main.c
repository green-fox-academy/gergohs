#include <stdio.h>
#include <stdlib.h>

#include "house.h"



int main()
{
    House house1;
    house1.area = 100;
    house1.numberOfRooms = 3;
    house1.price = 20000;

    House house2;
    house2.area = 270;
    house2.numberOfRooms = 6;
    house2.price = 500000;

    print_worth_calc(worth_calc(house1));
    print_worth_calc(worth_calc(house2));
}
