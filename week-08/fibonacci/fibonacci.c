#include  "fibonacci.h"

int generate_fibonacci(int given_num)
{
    printf("The first %d elements of the Fibonacci sequence is: \n", given_num);
    int a=0;
    int b=1;
    int c;

    for (int i = 1; i<=given_num; i++)
    {
        printf("%d, ", a);
        c = a+b;
        a=b;
        b=c;
    }
    printf("\n");
    return 0;
}
