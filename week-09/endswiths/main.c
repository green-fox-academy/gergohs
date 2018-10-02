#include <stdio.h>
#include <stdlib.h>

/*
*
  * Create a method called `endsWithS` that takes a filename as a string
  * and returns the number of the words, that ends with 's'.
  *
  * Example cases:
  *
  * the correct output for the 'base.txt' is: 26
  * hint: Keep in mind that there may punctuation marks at the end of the words
  */

int main()
{
    int counter = 0;
    FILE*fpointer;
    fpointer = fopen("base.txt", "r");
    char *cpointer;
    char splitted_words[1000];
    fgets(splitted_words, 1000, fpointer);

    cpointer = strtok(splitted_words, " ,.!-:");

    while ( cpointer != NULL)
    {
        cpointer = strtok(NULL, " ,.!-:");
        if (cpointer[(strlen(cpointer)-1)] == 's')
        {
            printf("%s\n", cpointer);
            counter ++;
            printf("%d\n", counter);
        }
    }
//    printf("%d\n", counter);
}


