#include <stdio.h>
#include <stdlib.h>
// - Create an array variable named `p1`
//   with the following content: `[1, 2, 3]`
// - Create an array variable named `p2`
//   with the following content: `[4, 5]`
// - Print if `p2` has more elements than `p1`

int main()
{

    int p1[3]= {1,2,3};
    int p2[2]= {4,5};

  //  int n = sizeof(p1);
   // int m = sizeof(p2);

    if (sizeof(p2)>sizeof(p1))
    {
        printf("true \n");
    }
    else
    {
        printf("false");
    }
}
