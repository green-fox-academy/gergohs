#include "pokemon.h"

int main()
{
    Pokemons pokemon1;
    Pokemons pokemon2;
    Pokemons pokemon3;
    Pokemons pokemon4;
    Pokemons pokemon5;

    pokemon1.pokemon_type = water;
    pokemon1.speed = 6.0;
    pokemon1.strength = 3.8;

    pokemon2.pokemon_type = flying;
    pokemon2.speed = 9.0;
    pokemon2.strength = 2.5;

    pokemon3.pokemon_type = fire;
    pokemon3.speed = 2.0;
    pokemon3.strength = 8.9;

    pokemon4.pokemon_type = dragon;
    pokemon4.speed = 4.0;
    pokemon4.strength = 9.8;

    pokemon5.pokemon_type = fire;
    pokemon5.speed = 2.0;
    pokemon5.strength = 1.9;

    Pokemons pokemon_list[] = {pokemon1, pokemon2, pokemon3, pokemon4, pokemon5};

    int array_length = sizeof(pokemon_list)/sizeof(pokemon_list[0]);

    get_faster(pokemon_list, array_length, 3.0);
    get_type(pokemon_list, array_length, fire);
    get_strongest(pokemon_list, array_length, 5.0);
    get_max_strength(pokemon_list, array_length, water);
}
