#include <stdio.h>
#include <stdlib.h>
#include "computer.h"

int main()
{
    struct Computer noteBook;

    noteBook.ram_size_GB = 50;
    noteBook.cpu_speed_GHz = 1.2;
    noteBook.bits = 8;

    printf("Ram size is: %d GB\n", noteBook.ram_size_GB);
    printf("Cpu speed is: %.2f GHz\n", noteBook.cpu_speed_GHz);
    printf("Bits are: %d bit \n", noteBook.bits);

}
