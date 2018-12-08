#ifndef BUS_H_INCLUDED
#define BUS_H_INCLUDED

typedef struct bus_struct {
   char* name;
   int capacity;
   int number_of_seats;
   int number_of_standing_places;
} Bus;

void get_on(Bus* bus, int passengers);
void get_off(Bus* bus, int passengers);
char* get_name_with_most_capacity(Bus buses[], int size);

#endif // BUS_H_INCLUDED
