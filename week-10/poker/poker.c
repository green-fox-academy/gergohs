#include "poker.h"

Player* read_hands_from_file(char* filename, int* num_of_players)
{
    FILE* fpointer;
    fpointer = fopen(filename, "r");

    Player player[128];
    int counter = 0;

    char* token;
    char temp[128];

    while (fgets(temp, 128, fpointer))
    {
        token = strtok(temp, " ,");
        strcpy(player[counter].name, token);
        token = strtok(NULL, " ,");

        if (token[0] == 'S')
        {
            player[counter].first.type = S;
        }
        else if (token[0] == 'H')
        {
            player[counter].first.type = H;
        }
        else if (token[0] == 'C')
        {
            player[counter].first.type = C;
        }
        else if (token[0] == 'D')
        {
            player[counter].first.type = D;
        }
        if (token[1] == '1')
        {
            player[counter].first.value = ten;
        }
        else if (token[1] == '2')
        {
            player[counter].first.value = two;
        }
        else if (token[1] == '3')
        {
            player[counter].first.value = three;
        }
        else if (token[1] == '4')
        {
            player[counter].first.value = four;
        }
        else if (token[1] == '5')
        {
            player[counter].first.value = five;
        }
        else if (token[1] == '6')
        {
            player[counter].first.value = six;
        }
        else if (token[1] == '7')
        {
            player[counter].first.value = seven;
        }
        else if (token[1] == '8')
        {
            player[counter].first.value = eight;
        }
        else if (token[1] == '9')
        {
            player[counter].first.value = nine;
        }
        else if (token[1] == 'J')
        {
            player[counter].first.value = J;
        }
        else if (token[1] == 'Q')
        {
            player[counter].first.value = Q;
        }
        else if (token[1] == 'K')
        {
            player[counter].first.value = K;
        }
        else if (token[1] == 'A')
        {
            player[counter].first.value = A;
        }

        token = strtok(NULL, " ,");

        if (token[0] == 'S')
        {
            player[counter].second.type = S;
        }
        else if (token[0] == 'H')
        {
            player[counter].second.type = H;
        }
        else if (token[0] == 'C')
        {
            player[counter].second.type = C;
        }
        else if (token[0] == 'D')
        {
            player[counter].second.type = D;
        }
        if (token[1] == '1')
        {
            player[counter].second.value = ten;
        }
        else if (token[1] == '2')
        {
            player[counter].second.value = two;
        }
        else if (token[1] == '3')
        {
            player[counter].second.value = three;
        }
        else if (token[1] == '4')
        {
            player[counter].second.value = four;
        }
        else if (token[1] == '5')
        {
            player[counter].second.value = five;
        }
        else if (token[1] == '6')
        {
            player[counter].second.value = six;
        }
        else if (token[1] == '7')
        {
            player[counter].second.value = seven;
        }
        else if (token[1] == '8')
        {
            player[counter].second.value = eight;
        }
        else if (token[1] == '9')
        {
            player[counter].second.value = nine;
        }
        else if (token[1] == 'J')
        {
            player[counter].second.value = J;
        }
        else if (token[1] == 'Q')
        {
            player[counter].second.value = Q;
        }
        else if (token[1] == 'K')
        {
            player[counter].second.value = K;
        }
        else if (token[1] == 'A')
        {
            player[counter].second.value = A;
        }
        counter++;
    }
    *num_of_players = counter;
    return player;
    fclose(fpointer);
}

//**************************************************************************************************
//***********************************read_number_of_cards*******************************************
//**************************************************************************************************

int read_number_of_cards()
{
    int num_of_cards;
    printf("Please enter the number of cards: \n");
    scanf("%d", &num_of_cards);
    printf("The number of new cards are: %d\n", num_of_cards);
    return num_of_cards;
}

//**************************************************************************************************
//*********************************generate_random_cards********************************************
//**************************************************************************************************

card* generate_random_cards(int num_of_new_cards, card* random_cards)    //-> fills random_cards array with 'number' random cards
{

    int max_num = 13;
    int min_num = 2;

    srand(time(NULL));
    for (int i = 0; i < num_of_new_cards; i++){
        printf("%d \n", rand()%(max_num + 1 - min_num) + min_num);
    }


}

//**************************************************************************************************
//***************************************decide_winner**********************************************
//**************************************************************************************************

/*
decide_winner(random_cards, array of names with hands and size)             //-> returns a name
{



}
*/
