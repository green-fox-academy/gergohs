#include "sandwich.h"

float priceCalc (Sandwich sandwich, int order)
{
    float price = sandwich.price* (float)order;
    return printf("%.2f", price);
}
