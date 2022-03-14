//#include <stdio.h>
//#include <stdlib.h>
//
//#pragma warning(disable:4996)
//
//void main() {
//    FILE *fp;
//    char c;
//    fp = fopen("sample1.txt", "w");
//    if (fp == NULL) {
//        printf("can not open");
//        exit(1);
//    }
//
//    printf("input a character. exit -> ctrl+z");
//    while ((c = getchar()) != 'Z') {
//        putc(c, fp);
//    }
//    fclose(fp);
//}