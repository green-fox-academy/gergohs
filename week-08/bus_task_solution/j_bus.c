#include <stdio.h>
#include <stdlib.h>
#include "j_bus.h"

void print_information(Bus* bus)
{
    int seats = bus->number_of_seats - bus->capacity;
    if(seats < 0)
    {
        seats = 0;
    }

    int standing_places = bus->number_of_standing_places - (bus->capacity - (bus->number_of_seats - seats));
    printf("%s: We have %d passengers. There is %d empty seats and %d standing places left.\n",
           bus->name, bus->capacity, seats, standing_places);
}

void get_on(Bus* bus, int passengers)
{
    if(bus->capacity + passengers > bus->number_of_seats + bus->number_of_standing_places)
    {
        printf("%s: Too much passengers want to get on the bus. No action taken!\n", bus->name);
        return;
    }

    bus->capacity += passengers;
    print_information(bus);

}

void get_off(Bus* bus, int passengers)
{
   if(bus->capacity < passengers)
   {
       printf("%s: Too much passengers want to get off the bus. No action taken!\n", bus->name);
       return;
   }

   bus->capacity -= passengers;
   print_information(bus);
}

char* get_name_with_most_capacity(Bus buses[], int size)
{
    int max_index = 0;
    for(int i = 1; i < size; ++i)
    {
        if(buses[i].capacity > buses[max_index].capacity)
        {
            max_index = i;
        }
    }

    return buses[max_index].name;
}
