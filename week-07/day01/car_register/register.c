#include "register.h"


void get_older_cars_than(Cars* list, int array_length, int age)
{
    int older_counter=0;
    for (int i =0; i < array_length; i++)
    {
        if (list[i].year_of_manufact < age)
        {
            older_counter++;
        }
    }
    printf("Cars older than the given age: %d\n", older_counter);
}

void get_transmission_count(Cars* list, int array_length, Transmission trnms)
{
    int transmission_counter=0;
    for (int i =0; i< array_length; i++)
    {
        if (list[i].transm_type == trnms)
        {
            transmission_counter++;
        }
    }
    printf("Number of the cars with that kind of transmission are: %d\n", transmission_counter);
}
