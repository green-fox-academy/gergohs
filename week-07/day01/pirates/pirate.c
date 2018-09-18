#include "pirate.h"

int sum_gold (Pirate pirate[], int size)
{
    int sum=0;
    for (int i = 0; i<size; i++)
    {
        sum += pirate[i].gold_count;
    }
    return printf("The total gold is: %d\n",sum);
}

//--------------------------------------------------------------------

float average_gold (Pirate pirate[], int size)
{
    float gold_avg = 0.0;
    float sum = 0.0;
    for (int i=0; i<size; i++)
    {
        sum += pirate[i].gold_count;
    }
    gold_avg = sum/size;
    return printf("The average gold is: %.2f\n", gold_avg);
}

//--------------------------------------------------------------------

char* richest_wooden_leg (Pirate pirate[], int size)
{
    char* richest = pirate[0].name;
    int maxGold = pirate[0].gold_count;

    for (int i = 0; i<size; i++)
    {
        if (pirate[i].has_wooden_leg && pirate[i].gold_count > maxGold)
        {
            maxGold = pirate[i].gold_count;
            richest = pirate[i].name;
        }
    }
    return printf("%s\n", richest);
}
