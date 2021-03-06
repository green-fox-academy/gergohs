#include <stdio.h>
#include <stdlib.h>
// Write a program that prints the numbers from 1 to 100.
// But for multiples of three print �Fizz� instead of the number
// and for the multiples of five print �Buzz�.
// For numbers which are multiples of both three and five print �FizzBuzz�.
// But this time use only switch case!

int main()
{
    for (int i=1; i<=100; i++)
    {
        switch(i%15)
        {
        case 0:
            printf("Fizzbuzz\n");
            break;
        case 5:
        case 10:
            printf("Buzz\n");
            break;
        case 3:
        case 6:
        case 9:
        case 12:
            printf("Fizz\n");
            break;
        default:
            printf("%d\n", i);
            break;
        }
    }
}
