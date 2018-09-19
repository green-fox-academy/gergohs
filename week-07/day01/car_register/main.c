#include <stdio.h>
#include <stdlib.h>
#include "register.h"

int main()
{
    Cars car1;
    Cars car2;
    Cars car3;
    Cars car4;
    Cars car5;
    Cars car6;

    car1.year_of_manufact = 2012;
    car1.transm_type=manual;
    car2.year_of_manufact = 2017;
    car2.transm_type=automatic;
    car3.year_of_manufact = 2002;
    car3.transm_type=manual;
    car4.year_of_manufact = 1997;
    car4.transm_type=manual;
    car5.year_of_manufact = 2018;
    car5.transm_type=automatic;
    car6.year_of_manufact = 2014;
    car6.transm_type=semi_automatic;

    Cars car_list[] = {car1, car2, car3, car4, car5, car6};
    int array_lenght = sizeof(car_list)/sizeof(car_list[0]);

    get_older_cars_than(car_list, array_lenght, 2000);
    get_transmission_count(car_list, array_lenght, manual);

}
