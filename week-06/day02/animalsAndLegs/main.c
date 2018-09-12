#include <stdio.h>
#include <stdlib.h>

// Write a program that asks for two integers
// The first represents the number of chickens the farmer has
// The second represents the number of pigs owned by the farmer
// It should print how many legs all the animals have

int main()
{

int chickens;
int pigs;

printf("Please enter first the number of the chickens than the number of pigs: \n");
scanf("%d %d", &chickens, &pigs);
printf("There are %d chickens and %d pigs \n", chickens, pigs);
printf("The farm has %d legs in totally!", chickens*2 + pigs * 4);

}
