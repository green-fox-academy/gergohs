#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1;
    int num2;

    printf("Please enter 2 numbers: ");
    scanf("%d %d",&num1,&num2);

    if (num1 < num2)
    {
        for (int i = num1; i < num2; i++)
        {
            printf("%d\n", num1++);
        }
    }
    else
    {
        printf("The second number should be bigger!\n");

    }
}
