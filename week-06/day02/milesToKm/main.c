#include <stdio.h>
#include <stdlib.h>

// Write a program that asks for an integer that is a distance in kilometers,
// then it converts that value to miles and prints it

int main()
{

int km;

printf("Please enter the km what you want to convert: \n");
scanf("%d", &km);
printf("It's %.2f miles! \n", km*0.62);

}
