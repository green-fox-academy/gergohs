#ifndef BUS_H_INCLUDED
#define BUS_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>

typedef struct
{
    char name[30];
    int capacity;
    int total_seats;
    int total_standing_places;
} Bus;

int get_on (Bus bus, int passangers_on);
int get_off (Bus bus, int passangers_off);
char find_largest_cap (Bus bus_list[], int list_size);

#endif // BUS_H_INCLUDED
