#include <stdio.h>
#include <stdlib.h>
#include "bus.h"

/*
Create a bus structure where you store:
    - name of the bus
    - capacity
    - number of seats
    - number of standing places
NOTE: the capacity = number of seats + number of standing places.
Store different type of buses in main() in an array.
1.Create a function for get on the bus. The number of new passengers should be
 passed as a parameter.

2.Create a function for getting off the bus. The number of passengers who are
 getting off should be passed as a parameter.

3.Each time these functions are called, they should print out the current capacity.
 First the passengers fill up all the seats, and then the standing places when they get on the bus.
 When they get off the bus, the standing places will be released first.
 EXAMPLE:
 An Ikarus 280 has 147 standing places and 36 seats this means it can carry 183 person.
 - We start with an empty bus. First there are 50 new passengers. So after the get on
   function called it should inform us:
   We have 50 passengers. There is 0 empty seats and 133 standing places left.
 - Then we call the get off function with 20 passengers. This time it should print out something like this:
   We have 30 passengers. There is 0 seats left and 153 standing places.
 - If too much passengers wants to get in, our function simply should inform us, that this is too much for this
   bus and pass without any further action.

4.Create a function which takes the whole bus array as a parameter and returns the name of the
 bus with the largest capacity.
*/


int main()
{
    Bus bus1;  //Ikarus
    Bus bus2;  //Neoplan
    Bus bus3;  //Volvo
    Bus bus4;  //Mercedes
    Bus bus5;  //Man;

    strcpy(bus1.name, "Ikarus");
    bus1.total_seats = 36;
    bus1.total_standing_places = 147;
    bus1.capacity = bus1.total_seats+bus1.total_standing_places;

    strcpy(bus2.name, "Neoplan");
    bus2.total_seats = 50;
    bus2.total_standing_places = 150;
    bus2.capacity = bus2.total_seats+bus2.total_standing_places;

    strcpy(bus3.name, "Volvo");
    bus3.total_seats = 80;
    bus3.total_standing_places = 200;
    bus3.capacity = bus3.total_seats+bus3.total_standing_places;

    strcpy(bus4.name, "Mercedes");
    bus4.total_seats = 70;
    bus4.total_standing_places = 0;
    bus4.capacity = bus4.total_seats+bus4.total_standing_places;

    Bus bus_list[4]= {bus1, bus2, bus3, bus4};
    int list_size = sizeof(bus_list)/sizeof(bus_list[0]);

    get_on(bus1, 140);
    get_on(bus1, 40);
    get_on(bus1, 20);

    find_largest_cap(bus_list, list_size);
}
