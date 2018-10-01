#include <stdio.h>
#include <stdlib.h>

/* Write a function which is called "get_fibonacci_number". It returns the "N"th
 * Fibonacci number, where "N" is received as a paramter.
 * For example:
 *  - get_fibonacci_number(1) returns 0
 *  - get_fibonacci_number(2) returns 1
 *  - get_fibonacci_number(3) returns 1
 *  - get_fibonacci_number(4) returns 2
 *  - get_fibonacci_number(5) returns 3
 *  - get_fibonacci_number(6) returns 5
 *
 *  If the function gets invalid parameter it returns -1.
 */

int main()
{
    //  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946,
    //  17711, 28657, 46368, 75025, 121393, 196418, 317811,

    int given_num;
    int i;
    int a = 0;
    int b = 1;
    int c;

    printf("Please enter a number\n");
    scanf("%d", &given_num);
   // printf("0 ");
   // printf("1 ");
   printf("The first %d elements of the Fibonacci sequence is: \n", given_num);

    for (i = 1; i<=given_num; i++)
    {
        printf("%d, ", a);
        c = a+b;
        a=b;
        b=c;
    }
    printf("\n");

    return 0;
}
