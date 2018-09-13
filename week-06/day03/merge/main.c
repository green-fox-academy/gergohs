#include <stdio.h>
#include <stdlib.h>

// please allocate a 10 long array and fill it with even numbers
// please allocate a 10 long array and fill it with odd numbers
// select an array, and push the elements into the another array
// print it the array in descending order
// delete the arrays after you don't use them

int main()
{
    int* pointer = NULL;
    int* pointer2 = NULL;
    const int size = 10;
    pointer = (int*) malloc(size*sizeof(int));
    pointer2 = (int*) malloc(size*sizeof(int));

    for (int i = 0; i < size*2; i+=2)
    {
        pointer[i]=i;
        printf("%d ", pointer[i]);
    }

    printf("\n");

    for (int i = 1; i < size*2; i+=2)
    {
        pointer2[i] = i;
        printf("%d ", pointer2[i]);
    }

    realloc(pointer, 0);
    realloc(pointer2,0);
    return 0;
}

