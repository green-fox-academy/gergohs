// - Create an array variable named `s`
//   with the following content: `[1, 2, 3, 8, 5, 6]`
// - Change the 8 to 4
// - Print the fourth element

#include <stdio.h>
#include <stdlib.h>

int main()
{

    int s[5] = {1,2,3,8,5,6};

    s[3]= 4;

    printf("%d\n", s[3]);

}
