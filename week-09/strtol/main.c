#include <stdio.h>
#include <stdlib.h>

int main () {
   char str[30] = "2018 Budapest";
   char *ptr;
   long ret;

   ret = strtol(str, &ptr, 10);
   printf("The number(unsigned long integer) is: %ld\n", ret);
   printf("String part is: %s\n", ptr);

   return(0);
}
