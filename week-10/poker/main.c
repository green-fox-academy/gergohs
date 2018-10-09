#include <stdio.h>
#include <stdlib.h>
#include "poker.h"

int main()
{
    int num_of_new_cards;
    int num_of_players = 0;
    card* random_cards;

    Player* poker_players = read_hands_from_file("hand.txt", &num_of_players);

    num_of_new_cards = read_number_of_cards();

    card* cards_array = generate_random_cards(num_of_new_cards, &random_cards);


//******************************************************************************
/*    for (int i = 0; i < num_of_players; i++){
        printf("%s\n", poker_players[i].name);
    }
    printf("%u\n", poker_players[0].first.type);
    printf("%u\n", poker_players[0].first.value);
*/
//******************************************************************************

    return 0;
}




