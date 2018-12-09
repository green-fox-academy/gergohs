#include <stdio.h>
#include <stdlib.h>

int end = 100;


void fizz_buzz_switch_statement();

int main()
{
    printf("Fizzbuzz in C with switch statement: \n");
    fizz_buzz_switch_statement();

    return 0;
}

void fizz_buzz_switch_statement()
{
    for (int i = 1; i<=end; i++)
    {
        switch (i%15)
        {
        case 0:
            printf("Fizz-buzz \n");
            break;
        case 5:
        case 10:
            printf("Buzz \n");
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            printf("Fizz \n");
            break;
        default:
            printf("%d \n", i);
            break;
        }
    }
}
