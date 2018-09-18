#ifndef REGISTER_H_INCLUDED
#define REGISTER_H_INCLUDEDû
#include <stdio.h>
#include <stdlib.h>

enum transmission {
    manual, automatic, CVT, semi_automatic, dual_clutch} transmission;

typedef struct
{
    char manufacturer[256];
    float price_in_euros;
    int year_of_manufact;
    enum transmission;
} Cars;

void get_older_cars_than(struct car* array, int array_length, int age);

void get_transmission_count(struct car* array, int array_length, enum transmission trnsm);

#endif // REGISTER_H_INCLUDED
