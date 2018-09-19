#ifndef POKEMON_H_INCLUDED
#define POKEMON_H_INCLUDED

#include <stdio.h>
#include <stdlib.h>

typedef enum
{
    normal, fire, water, electric, grass, ice, fighting, poision, ground, flying, psychic, bug, rock, ghost, dragon, dark, steel, fairy
} Type;

typedef struct
{
    char name[256];
    int age;
    float strength;
    float speed;
    Type pokemon_type;
} Pokemons;

void get_faster(Pokemons* pokemon_list, int array_length, float speed);

void get_type(Pokemons* pokemon_list, int array_length, Type pokemon_type);

char* pokemon_type_finder(Type type);

void get_strongest(Pokemons* pokemon_list, int array_length, float strength);

void get_max_strength(Pokemons* pokemon_list, int array_length, Type given_type);

#endif // POKEMON_H_INCLUDED
