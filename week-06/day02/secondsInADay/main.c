#include <stdio.h>
#include <stdlib.h>
// Write a program that prints the remaining seconds (as an integer) from a
// day if the current time is represented by the variables

int main()
{
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int secondsSpent = currentHours*3600 + currentMinutes*60 + currentSeconds;
    int secondsInDay = 86400;


        printf("Seconds left from the day: %d \n", secondsInDay-secondsSpent);


    return 0;
}
