#ifndef REGISTER_H_INCLUDED
#define REGISTER_H_INCLUDED�
#include <stdio.h>
#include <stdlib.h>

enum transmission {manual, automatic, CVT, semi_automatic, dual_clutch} transmission;

typedef struct
{
    char manufacturer[256];
    float price_in_euros;
    int year_of_manufact;
    enum transmission;
}

#endif // REGISTER_H_INCLUDED
