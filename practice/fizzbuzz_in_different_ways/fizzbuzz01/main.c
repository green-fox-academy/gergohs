#include <stdio.h>
#include <stdlib.h>

int end = 100;

void fizz_buzz_if_else ();

int main()
{
    printf("Fizzbuzz basic solution in C: using if-else \n");
    fizz_buzz_if_else();

    return 0;
}

void fizz_buzz_if_else ()
{
    for (int i = 1; i <= end; i++)
    {
        if (i % 3 == 0 && i % 5 == 0)
        {
            printf("Fizz-Buzz \n");
        }
        else if (i % 3 == 0)
        {
            printf("Fizz \n");
        }
        else if (i % 5 == 0)
        {
            printf("Buzz \n");
        }
        else
        {
            printf("%d \n", i);
        }
    }
}
