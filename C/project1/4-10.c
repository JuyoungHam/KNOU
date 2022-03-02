#include <stdio.h>

void main() {
    enum syllable {
        Do, Re, Mi, Fa
    } tone;

    for (tone = Do; tone <= Fa; tone += 1) {
        switch (tone) {
            case Do :
                printf("Do\n");
                break;
            case Re :
                printf("Re\n");
                break;
            case Mi :
                printf("Mi\n");
                break;
            case Fa :
                printf("Fa\n");
                break;
        }
    }
}