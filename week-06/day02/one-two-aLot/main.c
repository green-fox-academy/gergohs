#include <stdio.h>
#include <stdlib.h>
// Write a program that reads a number form the standard input,
// If the number is zero or smaller it should print: Not enough
// If the number is one it should print: One
// If the number is two it should print: Two
// If the number is more than two it should print: A lot

int main()
{
int givenNumber;
printf("Please enter a number: ");
scanf("%d", &givenNumber);

if (givenNumber <= 0) {
    printf("Not enough!\n");
    } else if (givenNumber == 1) {
    printf("One\n");
    } else if (givenNumber == 2) {
    printf("Two\n");
    } else {printf("A lot!\n");
    }
}
