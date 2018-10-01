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
    int given_num;
    printf("Please enter a number\n");
    scanf("%d", &given_num);

    generate_fibonacci(given_num);
}



int generate_fibonacci(int given_num)
{
    printf("The first %d elements of the Fibonacci sequence is: \n", given_num);
    int a=0;
    int b=1;
    int c;

    for (int i = 1; i<=given_num; i++)
    {
        printf("%d, ", a);
        c = a+b;
        a=b;
        b=c;
    }
    printf("\n");
    return 0;
}

