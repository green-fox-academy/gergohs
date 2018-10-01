#include <stdio.h>
#include <stdlib.h>

int main()
{
    int bin = 01101001;  //105 helyett 273
    int ascii = 0, base = 1, rem;

    while (bin > 0)
    {
        rem = bin % 10;
        ascii = ascii + rem * base;
        bin = bin / 10 ;
        base = base * 2;
    }

    printf("%d",ascii);



    /* int n;
     scanf("Enter a num: %d\n", n);

     int num=0;
     int i = 0;
     int rem;
     int base = 1;

     while (n>0)
     {
         rem = n%10;
         num = num + rem*base;
         n=n/10;
         base = base *2;

     }
     printf("Decimal number is: %d", num);
     return 0;
     */
}
