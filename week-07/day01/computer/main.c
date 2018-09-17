#include <stdio.h>
#include <stdlib.h>
#include "computer.h"

int main()
{
    struct Computer myComputer;

    myComputer.ram_size_GB = 50;
    myComputer.cpu_speed_GHz = 1.2;
    myComputer.bits = 16;

    printf("My computer has %d GB ram, %.2f GHz cpu and %d bits.\n\n", myComputer.ram_size_GB, myComputer.cpu_speed_GHz, myComputer.bits);

    NoteBook myNotebook;
    myNotebook.ram_size_GB = 80;
    myNotebook.cpu_speed_GHz = 2.4;
    myNotebook.bits = 24;

    printf("My notebook has %d GB ram, %.2f GHz cpu and %d bits.\n\n", myNotebook.ram_size_GB, myNotebook.cpu_speed_GHz, myNotebook.bits);
}
