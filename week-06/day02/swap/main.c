#include <stdio.h>
#include <stdlib.h>

int main()
{
// Swap the values of the variables

  int a = 123;
  int b = 526;

  int temp = a;
  a = b;
  b = temp;

  printf("Value of 'a' is: %d \n", a);
  printf("Value of 'b' is: %d \n", b);


    return 0;
}
