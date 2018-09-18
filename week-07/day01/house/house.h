#ifndef HOUSE_H_INCLUDED
#define HOUSE_H_INCLUDED

typedef struct
{
    char address [50];
    int price;
    int numberOfRooms;
    int area;
} House;

int worth_calc (House house);

void print_worth_calc (return_value);

#endif // HOUSE_H_INCLUDED
