#include <stdio.h>
#include <stdlib.h>

int main()
{
    FILE* fpointer;
    fpointer = fopen("sample.txt", "r");
    FILE* fpointer2;
    fpointer2 = fopen("reversed.txt", "a");
    char* buffer = (char*) malloc(1000*sizeof(char));
    int size = (int*) malloc(1000*sizeof(int));

    if (fpointer == NULL)
    {
        printf("Error, could not open the file\n");
    } else if (fpointer2 == NULL)
    {
        printf("Error, could not write the file\n");
    }

    while(fgets(buffer, size, fpointer))
    {
        printf("%s\n", strrev(buffer));
        fputs(buffer, fpointer2);
    }
}
