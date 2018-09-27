#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include "rs232/rs232.h"
#include "printer.h"
#include "parser.h"

int main()
{
    int logging_is_running = 0;
    comEnumerate();
    print_startup_message();
    char* file_name = "temp_logger.txt";
    char* tokenized_text = "tokenized_text.txt";

    while (1)
    {
        if (kbhit())
        {
            char key = getch();
            switch (key)
            {
            case 'h':
                print_startup_message();
                break;
            case 'l':
                print_port_list();
                break;
            case 'p':
                get_port_name();
                break;
            case 'o':
                open_port();
                break;
            case 's':
                if (logging_is_running)
                {
                    logging_is_running = 0;
                    printf("Logging stopped\n");
                }
                else
                {
                    logging_is_running = 1;
                    printf("Logging started\n");
                }
                break;
            case 'c':
                close_port();
                break;
            case 'k':
                error_handler(file_name);
                break;

            case 'q':
                remove(file_name);
                clear_screen();
                printf("\n ----------File deleted----------\n");
                printf("\n ----Push 'H' to go back to Main----\n");
                break;
            default:
                break;
            }

            if (key == 'e')
                break;
        }

        if (logging_is_running)
        {
            if (log_data(file_name) != 0)
            {
                printf("Logging error.\n");
                printf("Logging stopped\n");
                logging_is_running = 0;
            }
        }
    }

    comTerminate();
    return 0;
}
