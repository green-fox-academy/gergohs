#include <stdio.h>
#include <stdlib.h>

int main()
{
    int intnum = 8;
    double dub_num = 5;
    int num[5] = {1, 2, 3, 4, 5};
    char letter = 'D';
    char char_array[] = "Hello";
    char name[] = "Huba";
    char *p_name = name;

    printf("Memory size of an integer: %d\n", sizeof(intnum));
    printf("Memory size of a double: %d\n", sizeof(dub_num));
    printf("Memory size of a char: %d\n", sizeof(letter));
    printf("Memory size of the char array(string): %d\n", sizeof(char_array));
    printf("Arrays:\n");
    printf("Memory size of the first element: %d\n", sizeof(num[0]));
    printf("Memory size of the array: %d\n", sizeof(num));
    printf("Elements in the array: %d\n", sizeof(num)/sizeof(num[0]));
    printf("Name: %s\n", name);
    printf("Name with pointer: %s\n", p_name);
    printf("Size of Name: %d\n", sizeof(name));
    printf("Size of Name with strlen: %d\n", strlen(name));

    return 0;
}
