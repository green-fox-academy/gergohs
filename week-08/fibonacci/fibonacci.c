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
//*********************************************************************************
//*********************************************************************************

int find_nth_element(int element)
{
    int fib[element+2];
    int i;

    fib[0]=0;
    fib[1]=1;

    for (i=2; i<=element; i++)
    {
        fib[i]=fib[i-1]+fib[i-2];
    }
    printf("The %d element of the Fibonacci sequence is: %d \n", element, fib[element]);
    return 0;
}

