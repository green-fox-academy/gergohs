#include <stdio.h>
#include <stdlib.h>

#ifndef PIRATE_H_INCLUDED
#define PIRATE_H_INCLUDED

typedef struct
{
    char name[100];
    int has_wooden_leg;
    short int gold_count;
} Pirate;


int sum_gold (Pirate pirate[], int size);

float average_gold (Pirate pirate[], int size);

char* richest_wooden_leg (Pirate pirate[], int size);

#endif // PIRATE_H_INCLUDED
