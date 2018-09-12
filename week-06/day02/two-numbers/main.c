 // Create a program that prints a few operations on two numbers: 22 and 13

  // Print the result of 13 added to 22

  // Print the result of 13 substracted from 22

  // Print the result of 22 multiplied by 13

  // Print the result of 22 divided by 13 (as a decimal fraction)

  // Print the reminder of 22 divided by 13

#include <stdio.h>
#include <stdlib.h>

int main()
{
int num1 = 13;
int num2 = 22;

printf("%d \n", num1+num2);
printf("%d \n", num2-num1);
printf("%d \n", num1*num2);
printf("%.2f \n", (float)num2/num1);
printf("%d \n", num2%num1);

    return 0;
}
