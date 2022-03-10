//#include <stdio.h>
//
//void main() {
//    int n;
//    int count;
//    float avg;
//    float d;
//    float sum = 0;
//    float list[100];
//    printf("how many?");
//    scanf("%d", &n);
//    for (count = 0; count < n; ++count) {
//        printf("i = %d\tx = ", count + 1);
//        scanf("%f", &list[count]);
//        sum += list[count];
//    }
//    avg = sum / n;
//    printf("the average is %5.2f\n", avg);
//
//    for (count = 0; count < n; ++count) {
//        d = list[count] - avg;
//        printf("i = %d\tx = %5.2f\td = %5.2f\n", count + 1, list[count], d);
//    }
//}