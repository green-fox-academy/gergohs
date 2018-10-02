#include "hacker.h"

int binary_converter(int bin)
{
  int ascii = 0, base = 1, rem;

  while (bin > 0)
  {
    rem = bin % 10;
    ascii = ascii + rem * base;
    bin = bin / 10 ;
    base = base * 2;
  }

  return ascii;
}
