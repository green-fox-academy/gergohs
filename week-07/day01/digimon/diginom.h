#ifndef DIGINOM_H_INCLUDED
#define DIGINOM_H_INCLUDED

#include <stdio.h>
#include <stdlib.h>

typedef enum
{
    baby, in-training, rookie, champion, ultimate, mega
} Digivolution;

typedef struct
{
    char name[128];
    int age;
    int healt;
    char name_of_tamer[256];
    Digivolution digivol_level;
} Digimon;



#endif // DIGINOM_H_INCLUDED
