#include <stdio.h>
#include <stdlib.h>
//- Create an array variable named `t`
//  with the following content: `[1, 2, 3, 4, 5]`
//- Increment the third element
//- Print the third element

int main()
{
    int t[5] = {1,2,3,4,5};

    printf("%d\n", ++t[2]);
}
