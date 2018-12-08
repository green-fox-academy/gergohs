#include <stdio.h>
#include <stdlib.h>
#include "j_bus.h"

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
  Bus buses[] ={
    { .name = "Bus1", .capacity = 0, .number_of_seats = 100, .number_of_standing_places = 200 },
    { .name = "Bus2", .capacity = 0, .number_of_seats = 250, .number_of_standing_places = 250 },
    { .name = "Bus3", .capacity = 0, .number_of_seats = 2, .number_of_standing_places = 8 },
    { .name = "Bus4", .capacity = 0, .number_of_seats = 1, .number_of_standing_places = 999 }
  };

  get_on(&buses[0], 50); //expected: 50 passengers, 50 seats, 200 standing_places
  get_on(&buses[0], 50); //expected: 100 passengers, 0 seats, 200 standing_places
  get_on(&buses[0], 50); //expected: 150 passengers, 0 seats, 150 standing_places
  get_off(&buses[0], 60); //expected: 90 passengers, 10 seats, 200 standing_places
  get_on(&buses[0], 100); //expected: 190 passengers, 0 seats, 110 standing_places
  get_on(&buses[0], 120); //expected: Too much tried to get on: 190 passengers, 0 seats, 110 standing_places
  get_off(&buses[0], 200); //expected: Too much tried to get off: 190 passengers, 0 seats, 110 standing_places
  get_off(&buses[0], 180); //expected: 10 passengers, 90 seats, 200 standing_places
  get_off(&buses[0], 10); //expected: 0 passengers, 100 seats, 200 standing_places

  printf("\n\n");
  get_on(&buses[0], 200);
  get_on(&buses[1], 201);
  get_on(&buses[2], 5);
  get_on(&buses[3], 199);
  printf("%s has the most capacity\n", get_name_with_most_capacity(buses, sizeof(buses)/sizeof(buses[0]))); //expected: Bus2

  return 0;
}
