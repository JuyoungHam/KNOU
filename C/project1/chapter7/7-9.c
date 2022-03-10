//#include <stdio.h>
//
//union money {
//    int kor;
//    float us;
//};
//
//void main() {
//    float er;
//    union money m;
//    printf("how much : ");
//    scanf("%d", &m.kor);
//    printf("rate : ");
//    scanf("%f", &er);
//    printf("kor = %d", m.kor);
//    m.us = m.kor / er;
//    printf(", us = %8.3f \n", m.us);
//}