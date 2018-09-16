#include <stdio.h>
#include <string.h>
// create a function which takes a char array as a parameter,
// and splits a string to words by space
// solve the problem with the proper string.h function
void splitter (char name[]);

int main()
{
    char dontPanic[] = "We live in a beautiful world!";
    splitter(dontPanic);
}

void splitter (char name[])
{
    char *splittedWord = strtok(name, " !");
    while (splittedWord != NULL)
    {
        printf("%s\n", splittedWord );
        splittedWord = strtok(NULL, " !");
    }
}


