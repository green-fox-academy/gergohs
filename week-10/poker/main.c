#include <stdio.h>
#include <stdlib.h>
#include "poker.h"

int main()
{
    int num_of_new_cards;
    int num_of_players;

    Player* player_array = read_hands_from_file("hand.txt", &num_of_players);

    num_of_new_cards = read_number_of_cards();

  //  generate_random_cards();

}
