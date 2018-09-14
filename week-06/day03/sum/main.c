#include <stdio.h>
#include <stdlib.h>
// - Write a function called `sum` that sum all the numbers
//   until the given parameter and returns with an integer
void sum (int number[]);

int main()
{
    int numbers[] = {2,4,6,8,10};
    sum(numbers);
}

void sum (int number[])
{
    int temp = 0;
    for (int i=0; i <= sizeof(number); i++)
    {
        temp += number[i];
    }
    printf("%d", temp);
}

