#include "diginom.h"


void min_health_index (Digimon digimon_list, array_length)
{
    int min_health = digimon_list[0].healt;
    int min_index = 0;

    for (int i=0; i<array_length; i++)
    {
        if (digimon_list[i].healt < min_health)
        {
            min_health = digimon_list[i].healt;
            min_index = i;
        }
    }
    printf("The minimum health level is: %d\n", min_index);
}
