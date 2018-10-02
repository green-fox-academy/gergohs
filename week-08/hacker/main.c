#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "hacker.h"

/*
 * Hacker:
 *
 * Create a function that should convert binary numbers
 * to a letter (from ASCII code).
 * Binary numbers are stored in the text.txt.
 *
 * text.txt example:
 * 01001101
 * 00101011
 *
 * Write the converted letters into me_the_hacker.txt.
 *
 * me_the_hacker.txt example:
 * kitty
 *
 * The function should should return with the converted word. (cica)
 */

int main()
{
    FILE* text_pointer;
    FILE* text_pointer2;
    text_pointer = fopen("text.txt", "r");
    text_pointer2 = fopen("me_the_hacker.txt", "w");

    int bin_num;
    int ascii_num;

    if (text_pointer == NULL){
        printf("Could not open the file for read.");
    } else if (text_pointer2 == NULL){
        printf("Could not create and write the converted file.");
    } else {
        while (fscanf(text_pointer,"%d", &bin_num) == 1){
            int ascii_num = binary_converter(bin_num);
            printf("%c", (char)ascii_num);
            fputc(ascii_num, text_pointer2);
        }
    }
    fclose(text_pointer);
    fclose(text_pointer2);
}

















/*
  hétfõ
    FILE* text_pointer;
    FILE* text_pointer2;
    text_pointer = fopen("text.txt", "r");
    text_pointer2 = fopen("me_the_hacker.txt", "w");

//*********************************************************************
//*********************************************************************

int numbers[4];
char bin_nums[32];
int i;
int ascii;

char*cptr;
long ret;
int my_num;


//    while (fgets(bin_nums, 32, text_pointer)!= NULL)
while (fscanf(text_pointer, "%d", my_num)!= NULL)
{
    printf("Binary nums: %s\n", bin_nums);
    ret = strtol(bin_nums, &cptr, 10);
    printf("Dec num: %ld\n", ret);

    /*
       for (int i =0; i < 4; i++)
        {
            while (bin_nums != 0)
            {
                int remainder = (int)bin_nums[i] % 2;

            }
        */
/*
        }
}

//   for (i = 0; i<4; i++)
//   {
//       binary_converter(bin_nums[i]);
//   }

/*
    for (i=0; i<4; i++)
    {
        fscanf(text_pointer, "%d\n", &numbers[i]);
        printf("%d\n", (char)numbers[i]);

        fprintf(text_pointer2,"%s\n", &numbers[i]);
    }
*/
/*     while (numbers[i] >0)
     {
         rem = numbers[i] % 10;
         decimal_val = decimal_val + rem * base;
         numbers[i] = numbers[i] / 10;
         base = base * 2;
     }*/

/*
fclose(text_pointer);
fclose(text_pointer2);
}

int binary_converter(char bin_nums[32])
{

}
*/

