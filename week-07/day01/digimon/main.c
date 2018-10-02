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
    strcpy(digimon1.name_of_tamer, "monster");

    digimon2.healt = 40;
    digimon2.digivol_level = baby;
    strcpy(digimon2.name_of_tamer, "fighter");

    digimon3.healt = 10;
    digimon3.digivol_level = baby;
    strcpy(digimon3.name_of_tamer, "wonder");

    digimon4.healt = 25;
    digimon4.digivol_level = champion;
    strcpy(digimon4.name_of_tamer, "monster");

    digimon5.healt = 49;
    digimon5.digivol_level = ultimate;
    strcpy(digimon5.name_of_tamer, "wonder");

    digimon6.healt = 55;
    digimon6.digivol_level = mega;
    strcpy(digimon6.name_of_tamer, "wonder");

    Digimon digi_list[] = {digimon1, digimon2, digimon3, digimon4, digimon5, digimon6};

    int size = sizeof(digi_list)/sizeof(digi_list[0]);
    Digivolution digivol_level = ultimate;
    char tamer[128] = "monster";

    min_health_index(digi_list, size);
    digivol_level_counter(digi_list, size, digivol_level);
    tamer_count(digi_list, size, tamer);
    same_tamer_avg (digi_list, size, tamer);
}
