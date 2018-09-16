#include <stdio.h>
#include <stdlib.h>
// Open a file called "my-file.txt"
// Write your name in it as a single line
int main()
{

    FILE * fPointer;
    fPointer = fopen("myname.txt", "w");

    fprintf(fPointer, "Gergo Horvath");

    fclose(fPointer);

}
