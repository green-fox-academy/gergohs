#include "deer.h"

char read_file(char* filename)
{
    deer_t* deer_array = (deer_t*)malloc(100*sizeof(deer_t));    //(deer_t*) malloc(100*sizeof(deer_t));
    FILE* fpointer;
    fpointer = fopen(filename, "r");
    char* buffer = (char*) malloc(1024*sizeof(char));
    char* token;
    int* token_weigth;
    int counter = 0;
    int buck_counter = 0;
    int doe_counter = 0;
    int fawn_counter = 0;

    if (fpointer == NULL)
    {
        printf("Error, could not read the file\n");
    }
    while (fgets(buffer, 500, fpointer))
    {
        token = strtok(buffer, " ,");
        deer_array[counter].gender = token;
        printf("%s\n", deer_array[counter].gender);

        if (token[counter]== "buck")
        {
            buck_counter++;
        }
        else if (token[counter]== "doe")
        {
            doe_counter++;
        }
        else if (token[counter]== "fawn")
        {
            fawn_counter++;
        }
        token_weigth = strtok(NULL, " ,");
        deer_array[counter].weigth = atoi(token_weigth);
        printf("%d\n", deer_array[counter].weigth);
        counter++;
    }
    printf("Buck counter: %d\n", buck_counter);
    printf("Doe counter: %d\n", doe_counter);
    printf("Fawn counter: %d\n", fawn_counter);
    /*   else if (fgets(buffer, 1000, fpointer) != NULL){
           token = strtok(buffer, ", ");
          // printf("%s,\n", token);
           strcpy(deer_array[counter].gender, token);
           token = strtok (NULL, " ,");
           //printf("%s\n", deer_array[counter].gender);
           counter++;
       }
       */
    printf("counter: %d \n", counter);
//    printf("Bucks: %d, does: %d, fawns: %d, \n", buck_counter, doe_counter, fawn_counter);
    return 0;
}







/*
        if (token[0] == "buck")
        {
            strcpy(deer_array[counter].gender, token);
            buck_counter++;
        }
        else if (token[0] == "doe")
        {
            strcpy(deer_array[counter].gender, token);
            doe_counter++;
        }
        else if (token[0] == "fawn")
        {
            strcpy(deer_array[counter].gender, token);
            fawn_counter++;
        }
        printf("%s\n", deer_array[counter].gender);
*/

