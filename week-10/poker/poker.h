#ifndef POKER_H_INCLUDED
#define POKER_H_INCLUDED
#include <stdio.h>
#include <stdlib.h>

typedef enum
{
    two, three, four, five, six, seven, eight, nine, ten, J, Q, K, A
} card_value ;

typedef enum
{
    S, H, C, D
} card_type;

typedef struct
{
    card_value value;
    card_type type;
} card;

typedef struct
{
    char name[256];
    card first;
    card second;
} Player;

Player* read_hands_from_file(char* filename, int* num_of_players);

int read_number_of_cards();

card* generate_random_cards(int num_of_new_cards, card* random_cards);

#endif // POKER_H_INCLUDED
