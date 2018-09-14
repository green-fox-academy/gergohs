#include <stdio.h>
#include <stdlib.h>
#include <string.h>
// - Create a char array variable named `typo` and assign the value `Chinchill` to it
// - Write a function called `appendAFunc` that gets a string as an input,
//   appends an 'a' character to its end and returns with a string
// - Print the result of `appendAFunc(typo)`

void appendAFunc (char typo[]);

int main()
{
    char typo[] = "chinchill";
    appendAFunc(typo);
    return 0;
}

void appendAFunc (char typo[])
{
    char temp[] = "a";
    printf("%s\n", strcat(typo, temp));
}
//    char typo2[] = "a";
//printf(strcat(typo, typo2));
