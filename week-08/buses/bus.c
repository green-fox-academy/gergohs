#include "bus.h"

/* 1.Create a function for get on the bus. The number of new passengers should be
 passed as a parameter.
2.Create a function for getting off the bus. The number of passengers who are
 getting off should be passed as a parameter.
3.Each time these functions are called, they should print out the current capacity.
 First the passengers fill up all the seats, and then the standing places when they get on the bus.
 When they get off the bus, the standing places will be released first.
*/

//***********************************************************************************************
int passangers_on;

int get_on (Bus bus, int passangers_on)
{
    int occupied_seats;
    int occupied_standing_place;
    int empty_seats;
    int empty_standing_place;

    if (passangers_on > bus.capacity)
    {
        printf("There are no enough space on the bus");
    }
    else if (passangers_on < bus.total_seats)
    {
        empty_seats = bus.total_seats-passangers_on;
        occupied_seats = bus.total_seats-empty_seats;
        empty_standing_place = bus.total_standing_places;
        passangers_on = passangers_on;
        bus.capacity = empty_seats+empty_standing_place;
        printf("We have %d passangers, %d seats and %d standing places left \n",
               passangers_on, empty_seats, empty_standing_place);
    }
    else if (passangers_on > bus.total_seats)
    {
        empty_seats = 0;
        occupied_seats = bus.total_seats;
        empty_standing_place = bus.total_standing_places -(passangers_on-bus.total_seats);
        bus.capacity = empty_seats+empty_standing_place;
        printf("We have %d passangers, %d seats and %d standing places left \n",
               passangers_on, empty_seats, empty_standing_place);
    }
}
//***********************************************************************************************
int get_off (Bus bus, int passangers_off)
{

}
//***********************************************************************************************
char find_largest_cap (Bus bus_list[], int list_size)
{
    int max_cap = 0;
    int i;

    for (i=0; i < list_size; i++)
    {
       // bus_list[i].capacity = bus_list[i].total_seats + bus_list[i].total_standing_places;

        if(bus_list[i].capacity > max_cap)
        {
            max_cap = bus_list[i].capacity;
        }
    }
    for (i=0; i< list_size; i++){
        if(bus_list[i].capacity == max_cap)
        {
            return printf("The fckin bus is: %s\n", bus_list[i].name);
//            strcpy (bus_name, bus_list[i].name);
        }

    }
    // printf("The max. capacity is: %s\n", max_cap);

    /*
        for (i = 0; i < list_size; i++)
        {
            bus_list[i].capacity = bus_list[i].total_seats + bus_list[i].total_standing_places;

            if(bus_list[i].capacity = max_cap)
            {
                return bus_list[i].name;
    //            strcpy (bus_name, bus_list[i].name);
            }
    //    return printf("%s\n", bus_list[i].name);
        }
    //   printf("WTF the name %s \n", bus_list[i].name);
    */
}
