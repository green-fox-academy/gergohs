#include "pirate.h"

int sum_gold (Pirate pirate[], int size)
{
    int sum=0;
    for (int i = 0; i<size; i++)
    {
        sum += pirate[i].gold_count;
    }
    return printf("%d\n",sum);
}

float average_gold (Pirate pirate[], int size)
{
    int gold_avg = 0;
    int sum = 0;
    for (int i=0; i<size; i++)
    {
        sum += pirate[i].gold_count;
    }
    gold_avg = sum/size;
    return printf("%d\n", gold_avg);
}
/*
int richest_wooden_leg (Pirate pirate[], int size)
{
    if (pirate.has_wooden_leg == 1)
    {
        return
    }
}
*/


