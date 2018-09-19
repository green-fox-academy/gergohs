#ifndef REGISTER_H_INCLUDED
#define REGISTER_H_INCLUDEDû
#include <stdio.h>
#include <stdlib.h>

typedef enum
{
    manual, automatic, CVT, semi_automatic, dual_clutch
} Transmission;

typedef struct
{
    char manufacturer[256];
    float price_in_euros;
    int year_of_manufact;
    Transmission transm_type;
} Cars;

void get_older_cars_than(Cars* list, int array_length, int age);

void get_transmission_count(Cars* list, int array_length, Transmission trnms);

#endif // REGISTER_H_INCLUDED
