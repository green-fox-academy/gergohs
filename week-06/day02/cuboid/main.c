#include <stdio.h>
#include <stdlib.h>
// Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

int main()
{
int a = 15;
int b = 20;
int c = 25;

printf("Surface area: %d \n", a*b*c);
printf("Volume: %d \n", 2*(a*b+a*c+b*c));

    return 0;
}
