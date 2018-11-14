/*
our task is to find their comparison points by comparing  with ,  with , and  with .

If a[i] > b[i], then Alice is awarded  point.
If a[i] < b[i], then Bob is awarded  point.
If a[i] = b[i], then neither person receives a point.
Comparison points is the total points a person earned.

*/


#include <stdio.h>
#include <stdlib.h>

void result_finder (int *array_a, int *array_b, int size);


int main()
{
    int alice[] = {5, 6, 7, 9,  3, 8, 10};
    int bob[] = {3, 6, 10, 7, 7, 1, 4};

    int alice_two[] = {17, 28, 30};
    int bob_two[] = {99, 16, 8};

    int array_size = sizeof(alice)/sizeof(alice[0]);
    int array_size_two = sizeof(alice_two)/sizeof(alice_two[0]);

    result_finder(alice, bob, array_size);                  // expected result: 1 1
    result_finder(alice_two, bob_two, array_size_two);      // expected result: 2 1

    return 0;
}


void result_finder (int *array_a, int *array_b, int size)
{
    int a_points = 0;
    int b_points = 0;

    for (int i = 0; i < size; i++)
    {
        if (array_a[i] > array_b[i])
        {
            a_points++;
        }
        else if (array_a[i] < array_b[i])
        {
            b_points++;
        }
    }
    printf("Alice points: %d, Bob points: %d \n", a_points, b_points);
}
