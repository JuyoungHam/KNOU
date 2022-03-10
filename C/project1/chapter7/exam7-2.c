//#include <stdio.h>
//
//void main() {
//    union shared_tag {
//        char c;
//        int i;
//        long l;
//        float f;
//        double d;
//    } shared;
//
//    shared.c = '$';
//    printf("%c\t\t", shared.c);
//    printf("%d\t\t", shared.i);
//    printf("%ld\t\t", shared.l);
//    printf("%f\t\t", shared.f);
//    printf("%f\t\n", shared.d);
//
//    shared.d = 123456789.8765;
//    printf("%c\t\t", shared.c);
//    printf("%d\t\t", shared.i);
//    printf("%ld\t\t", shared.l);
//    printf("%f\t\t", shared.f);
//    printf("%f\t\n", shared.d);
//}