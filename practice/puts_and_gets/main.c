#include <stdio.h>
#include <stdlib.h>

int main()
{
    char dog_name[50];
    char dog_food[50];

    puts("What is your dog name?");
    gets(dog_name);

    puts("What is his favorite food?");
    gets(dog_food);

    printf("Hey %s, here is some of your favorite, a portion of %s! \n", dog_name, dog_food);

    return 0;
}
