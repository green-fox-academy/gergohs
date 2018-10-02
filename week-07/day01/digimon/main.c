#include "digimon.h"

int main()
{
    Digimon digimon1;
    Digimon digimon2;
    Digimon digimon3;
    Digimon digimon4;
    Digimon digimon5;
    Digimon digimon6;

    digimon1.healt = 50;
    digimon1.digivol_level = baby;

    digimon2.healt = 40;
    digimon2.digivol_level = baby;

    digimon3.healt = 10;
    digimon3.digivol_level = baby;

    digimon4.healt = 25;
    digimon4.digivol_level = champion;

    digimon5.healt = 49;
    digimon5.digivol_level = ultimate;

    digimon6.healt = 55;
    digimon6.digivol_level = mega;

    Digimon digi_list[] = {digimon1, digimon2, digimon3, digimon4, digimon5, digimon6};



    int size = sizeof(digi_list)/sizeof(digi_list[0]);
    Digivolution digivol_level = training;


    min_health_index(digi_list, size);
    digivol_level_counter(digi_list, size, digivol_level);

}
