#include <stdio.h>
#include <stdlib.h>

int main()
{
    int rows;
    printf("Give me the number of the rows please: \n");
    scanf("%d", &rows);

    for (int i=0; i<=rows; i++)
    {
        for (int j=0; j<i; j++)
        {
            printf("%d",j);
        }
        printf("\n");
    }

    return 0;
}
