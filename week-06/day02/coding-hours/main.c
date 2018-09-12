// An average Green Fox attendee codes 6 hours daily
  // The semester is 17 weeks long
  //
  // Print how many hours is spent with coding in a semester by an attendee,
  // if the attendee only codes on workdays.
  //
  // Print the percentage of the coding hours in the semester if the average
  // work hours weekly is 52

#include <stdio.h>
#include <stdlib.h>

int main()
{
int dailyCodingHours = 6;
int weeks = 17;
int workDaysPerWeek = 5;
int workHoursPerWeek = 52;
int totalHoursPerSemester = weeks*workHoursPerWeek;
int totalCodingHours = weeks*workDaysPerWeek*dailyCodingHours;
double dubTotalHoursPerSemester = totalHoursPerSemester;
double dubTotalCodingHours = totalCodingHours;

printf("%d hours spent with coding during the semester! \n", weeks * workDaysPerWeek * dailyCodingHours);
printf("%.2f %% of total time spent with coding during the semester! \n", dubTotalCodingHours/dubTotalHoursPerSemester*100);

    return 0;
}
