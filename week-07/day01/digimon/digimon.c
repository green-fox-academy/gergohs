#include "digimon.h"


int min_health_index (Digimon *digi_list, int size)
{
    int min_health = digi_list[0].healt;
    int min_index = 0;

    for (int i=0; i<size; i++)
    {
        if (digi_list[i].healt < min_health)
        {
            min_health = digi_list[i].healt;
            min_index = i;
        }
    }
    printf("The index of the digimon which has the minimum health level: %d\n\n", min_index);
}
//*********************************************************************************************************
//*********************************************************************************************************

int digivol_level_counter (Digimon *digi_list, int size, Digivolution digivol_level)
{

    int counter = 0;
    for (int i = 0; i < size; i++){
        if (digi_list[i].digivol_level == digivol_level){
            counter++;
        }
    }
        return printf("The number of the digimons int the given level: %d \n", counter);
}
//*********************************************************************************************************
//*********************************************************************************************************


