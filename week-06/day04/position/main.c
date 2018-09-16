#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// lists all position where character 'i' is found

void positionFinder (char string[]);

int main ()
{
    char string[] = "This is a string for testing";
    char *pString = &string;
    positionFinder(string);
}

void positionFinder (char* pString)
{
    for (int i=0; i< strlen(pString); i++)
    {
        if(pString[i] == 'i')
        {
            printf("%d\n",i);
        }
    }
}
