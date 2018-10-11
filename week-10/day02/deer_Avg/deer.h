#ifndef DEER_H_INCLUDED
#define DEER_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
/*
typedef enum
{
    BUCK, DOE, FAWN
} gender_t;
*/
typedef struct
{
    int weigth;
    char* gender;
  //  gender_t genders;
} deer_t;

char read_file(char* filename);


#endif // DEER_H_INCLUDED
