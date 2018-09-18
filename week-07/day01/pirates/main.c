#include <stdio.h>
#include <stdlib.h>
#include "pirate.h"

int main()
{
    Pirate pirate1;
    Pirate pirate2;
    Pirate pirate3;
    Pirate pirate4;

    strcpy(pirate1.name, "Wooden_Leg_Will");
    pirate1.gold_count = 8;
    pirate1.has_wooden_leg = 1;

    strcpy(pirate2.name, "Lester_The_Kraken");
    pirate2.gold_count = 20;
    pirate2.has_wooden_leg = 0;

    strcpy(pirate3.name, "Foolish_Franky");
    pirate3.gold_count = 15;
    pirate3.has_wooden_leg = 1;

    strcpy(pirate4.name, "OneTwo");
    pirate4.gold_count = 66;
    pirate4.has_wooden_leg = 1;

    Pirate list_of_pirates[] = {pirate1, pirate2, pirate3, pirate4};
    int size = sizeof(list_of_pirates)/sizeof(pirate1);

    sum_gold(list_of_pirates, size);
    average_gold(list_of_pirates, size);
    richest_wooden_leg(list_of_pirates, size);
}
