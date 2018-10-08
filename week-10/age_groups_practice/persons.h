#ifndef PERSONS_H_INCLUDED
#define PERSONS_H_INCLUDED

typedef struct{
    char name[100];
    int year;
    int month;
    int day;
} persons_t;

typedef enum {
    BETWEEN_15_AND_20,
    BETWEEN_20_AND_25,
    BETWEEN_25_AND_30,
    BETWEEN_30_AND_35,
    BETWEEN_35_AND_40
} age_groups;


persons_t* get_persons(const char* file_name, int* number_of_persons);

void list_persons_in_age_groups(persons_t* persons, int number_of_persons, age_groups);

#endif // PERSONS_H_INCLUDED
