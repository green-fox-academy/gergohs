#include <stdio.h>
#include <stdlib.h>

void sum (int name);

int main()
{
    int ai[] = {3,4,5,6,7};

    summingFunc(ai);
}

int summingFunc (int ai[])
{
    int temp = 0;
    for (int i=0; i<5; i++)
    {
        temp += ai[i];
    }
    return printf("%d", temp);
}
