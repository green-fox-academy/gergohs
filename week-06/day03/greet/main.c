#include <stdio.h>
#include <stdlib.h>

void greeterFunc (char name[]);

int main( ){

    char a1[] = "Greenfox";

    greeterFunc(a1);
}

void greeterFunc (char name[])
{
    printf("Greetings dear, %s!\n", name);
}
