#include <stdio.h>
#include <stdlib.h>

// with malloc
// please allocate a 10 long array and fill it with even numbers then print the whole array
// please deallocate memory without using free

int main()
{
    int* pointer = NULL;
    const int size = 10;
    pointer = (int*) malloc(size*sizeof(int));
    for (int i = 0; i < size*2; i+=2)
    {
        pointer[i]=i;
        printf("%d ", pointer[i]);
    }

    realloc(pointer, 0);

    return 0;
}
