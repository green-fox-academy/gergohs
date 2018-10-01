#include <stdio.h>
#include <stdlib.h>
#include  "fibonacci.h"


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
    int element;
    printf("Please enter a number\n");
    scanf("%d", &given_num);

    printf("Please give the element what you want to find: ");
    scanf("%d", &element);

    generate_fibonacci(given_num);
    find_nth_element(element);
}

