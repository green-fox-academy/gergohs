#include <stdio.h>
#include <string.h>

// create a function which takes a char array as a parameter and
// returns the distance between the first and last occurance of character 's'
void distanceCalc (char* name);

int main ()
{
    char str[] = "This is a sample string";

    distanceCalc(str);
}

void distanceCalc (char* name)
{
    int first;
    int last;
    for (int i = 0; i<strlen(name); i++)
    {
        if (name[i] == 's')
        {
            first = i;
            break;
        }
    }

    for (int i = 0; i<strlen(name); i++)
    {
        if (name[i] == 's')
        {
            last = i;
        }
    }
    printf("First is: %d\n", first);
    printf("Last is: %d\n", last);
    printf("The distance between first and last is: %d\n", last-first);
}

