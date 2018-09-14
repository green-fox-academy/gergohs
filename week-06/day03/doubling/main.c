#include <stdio.h>
#include <stdlib.h>
// - Create a function called `doubling` that doubles it's input parameter and returns with an integer
// - parameter should be a pointer to the variable you want to double

int main()
{
    int num = 20;
    int* pNum = &num;
    doubling(pNum);
}

void doubling (int *pNum)
{
    int doubled = *pNum*2;
    printf("%d", doubled);
}
