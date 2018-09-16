#include <stdio.h>
#include <stdlib.h>
// Write a program that opens a file called "my-file.txt", then prints
// each of lines form the file.
// You have to create the file, you can use C-programming but it is not mandatory

int main()
{
    FILE * filePointer;

    filePointer = fopen("my-file.txt", "w");

    fprintf(filePointer, "You can take a picture of something you seen\nIn the future where will i be?\n");

    fclose(filePointer);
}
