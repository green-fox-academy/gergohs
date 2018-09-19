#include "pokemon.h"

void get_faster(Pokemons* pokemon_list, int array_length, float speed)
{
    int i;
    int faster_counter = 0;

    for (i=0; i<array_length; i++)
    {
        if (pokemon_list[i].speed > speed)
        {
            faster_counter++;
        }
    }
    printf("Nr. of pokemons faster than the given value: %d \n", faster_counter);
}
//--------------------------------------------------------------------------------
void get_type(Pokemons* pokemon_list, int array_length, Type given_type)
{
    int i;
    int type_counter = 0;

    for (i=0; i<array_length; i++)
    {
        if (pokemon_list[i].pokemon_type == given_type)
        {
            type_counter++;
        }
    }
    printf("Nr. of pokemons of the given type: %d \n", type_counter);
}
//--------------------------------------------------------------------------------
void get_strongest(Pokemons* pokemon_list, int array_length, float  strength)
{
    int i;
    float strongest = pokemon_list[0].strength;
    Type strongest_type = pokemon_list[0].pokemon_type;

    for (i=0; i<array_length; i++)
    {
        if (pokemon_list[i].strength > strongest)
        {
            strongest = pokemon_list[i].strength;
            strongest_type = pokemon_list[i].pokemon_type;
        }
    }
    printf("The strongest type is: %s\n", pokemon_type_finder(strongest_type));
}

char* pokemon_type_finder(Type type)
{
    switch (type)
    {
    case normal:
        return "normal";
    case fire:
        return "fire";
    case water:
        return "water";
    case electric:
        return "electric";
    case grass:
        return "grass";
    case ice:
        return "ice";
    case fighting:
        return "fighting";
    case poision:
        return "poison";
    case ground:
        return "ground";
    case flying:
        return "flying";
    case psychic:
        return "psychic";
    case bug:
        return "bug";
    case rock:
        return "rock";
    case ghost:
        return "ghost";
    case dragon:
        return "dragon";
    case dark:
        return "dark";
    case steel:
        return "steel";
    case fairy:
        return "fairy";
    }
}

//--------------------------------------------------------------------------------
void get_max_strength (Pokemons* pokemon_list, int array_length, Type given_type)
{
    float highest_strength = 0;

    for (int i=0; i<array_length; i++)
    {
        if (pokemon_list[i].pokemon_type == given_type && highest_strength < pokemon_list[i].strength)
        {
            highest_strength = pokemon_list[i].strength;
        }
    }
    printf("The max strength from the given type pokemon is: %.1f \n", highest_strength);
}
