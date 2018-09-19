#include "pokemon.h"

void get_faster(Pokemons* pokemon_list, int array_length, float speed)
{
    int i;
    int faster_counter;

    for (i=0; i<array_length; i++)
    {
        if (pokemon_list[i].speed < speed)
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
    int type_counter;

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
    char strongest_type = pokemon_list[0].pokemon_type;

    for (i=0; i<array_length; i++)
    {
        if (pokemon_list[i].strength > strongest)
        {
            strongest = pokemon_list[i].strength;
            strongest_type  = pokemon_list[i].pokemon_type;
        }
    }
    printf("The strongest type is: %c\n", strongest_type);
}
//--------------------------------------------------------------------------------
void get_max_strength (Pokemons* pokemon_list, int array_length, Type given_type)
{
    float highest_strength = pokemon_list[0].strength;

    for (int i=0; i<array_length; i++)
    {
        if (pokemon_list[i].pokemon_type == given_type && highest_strength < pokemon_list[i].strength)
        {
            highest_strength = pokemon_list[i].strength;
        }
    }
    printf("The max strength from the given type pokemon is: %.1f \n", highest_strength);
}
