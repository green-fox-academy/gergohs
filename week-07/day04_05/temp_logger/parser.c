#include <stdio.h>
#include <time.h>
#include "rs232/rs232.h"
#include "parser.h"
#include "printer.h"
#include "string.h"

int parser_port = -1;


int get_port_name()
{
    clear_screen();
    printf("Please enter the name of the serial port you want to use!\n");
    char port_name[PORT_NAME_MAX_LEN];
    fgets(port_name, PORT_NAME_MAX_LEN - 1, stdin);

    // Remove \r and \n characters
    for (int i = 0; i < PORT_NAME_MAX_LEN; i++)
    {
        if (port_name[i] == '\r' || port_name[i] == '\n')
            port_name[i] = '\0';
    }

    // Find the index of that port
    parser_port = comFindPort(port_name);

    if (parser_port < 0)
    {
        printf("%s not exists!\n", port_name);
        return -1;
    }
    else
    {
        printf("%s port exists, saved.\n", port_name);
    }

    return 0;
}
//*******************************************************************************************
int open_port()
{
    clear_screen();
    if (parser_port < 0)
    {
        printf("Port not set!\n");
        return -1;
    }

    comClose(parser_port);
    if(!comOpen(parser_port, BAUD_RATE))
    {
        printf("Port can not be opened. Try to set the port again!\n");
        return -1;
    }
    else
    {
        printf("Port opened successfully!\n");
        return 0;
    }
}
//*******************************************************************************************
int close_port()
{
    clear_screen();
    if (parser_port < 0)
    {
        printf("Port not set!\n");
        return -1;
    }

    comClose(parser_port);
    printf("Port closed.\n");
    return 0;
}

//*******************************************************************************************
int get_line_from_port(char *buff, int buff_len)
{
    if (parser_port < 0)
    {
        printf("Port not set!\n");
        return -1;
    }

    // Put data into the
    char ch;
    int i = 0;
    int bytes = comRead(parser_port, &ch, 1);
    // If there is no data on the port, exit
    if (bytes <= 0)
    {
        return 0;
    }
    // This loop will read until a \n character. If the buffer is too small, then
    // the characters will be discarded after the size limit is reached.
    while (ch != '\n')
    {
        // Check if there is enough space in the buffer
        if (i < (buff_len - 1))
        {
            // Check if we are not near the end of the line (cr character)
            if (ch != '\r')
            {
                buff[i] = ch;
                i++;
            }
        }
        while (comRead(parser_port, &ch, 1) == 0);
    }
    // Put terminating zero at the end
    buff[i] = '\0';

    return i;
}
//*******************************************************************************************


int log_data(char* file_name)
{
    // Check if port set up properly
    if (parser_port < 0)
    {
        printf("Port not set!\n");
        return -1;
    }

    // Get a line of data from the port
    // If there is no data on the port, then do nothing
    FILE*fPointer; //SSS

    char buff[PORT_BUFFER_LEN];

    if (get_line_from_port(buff, PORT_BUFFER_LEN) > 0)
    {
        // Put the data into the logfile
        //Printing the buffer
        printf("%s\n",buff);                                //eredeti konzolra kiírás

        fPointer = fopen(file_name, "a");                   //own
        fprintf(fPointer, buff);                            //own
        fprintf(fPointer, "\n");
        fclose(fPointer);                                   //own
    }

    return 0;
}

void error_handler (char* file_name)
{
    clear_screen();
    printf("\n----------------Filtered datas----------------\n");

    FILE* fPointer2;
    fPointer2 = fopen("temp_logger.txt", "r");
    FILE* tok_txt;
    tok_txt = fopen("filtered_text.txt", "a");

    char text_to_tokenize[100];
    char* date;
    char* time;
    char* temperature_data;
    char* year;
    char* month;
    char* day;

    while (fgets(text_to_tokenize, 1000, fPointer2) != NULL)
    {
        date = strtok(text_to_tokenize, " ");
        time = strtok(NULL, " ");
        temperature_data = strtok(NULL, " ");

        year = strtok(date, ".");
        month = strtok(NULL, ".");
        day = strtok (NULL, ".");

        if( 0 < atoi(year) && atoi(year) <= 2018 && atoi(year) <= 2018 && 0 < atoi(month) && atoi(month) <=31 && 0 <= atoi(day) && atoi(day) < 60)
        {
            printf("%s.%s.%s. \t %s",year, month, day, temperature_data);
            fprintf(tok_txt, "%s.%s.%s\t%s",year, month, day, temperature_data);
        }
    }
    fclose(fPointer2);
    fclose(tok_txt);
    return 0;
}

