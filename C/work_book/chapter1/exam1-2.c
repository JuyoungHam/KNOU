#include <stdio.h>

#define FZ_PT 32.0
#define S_FACTOR (5.0/9.0)

void main() {
    float fa, ce;
    printf("Enter fahrenheit temperature : ");
    scanf("%f", &fa);
    ce = (fa - FZ_PT) * S_FACTOR;
    printf("\nCelsius equivalent : %.1f\n", ce);
}