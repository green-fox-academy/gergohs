#include "house.h"

int worth_calc (House house)
{
    int market_price = 400;
    int house_actual_price = house.price/house.area;

    if (house_actual_price<market_price)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

void print_worth_calc (int return_value)
{
    switch (return_value)
    {
    case 0:
        printf("This one is not a good buy\n");
        break;
    case 1:
        printf("It's good for buy\n");
        break;
    }
}
