//#include <stdio.h>
//#include <stdlib.h>
//
//void main() {
//    FILE *fp;
//    char no[10], name[10];
//    int mid, term, rep, att, i;
//
//    fp = fopen("sample3.txt", "r");
//    if (fp == NULL) {
//        printf("can not open");
//        exit(1);
//    }
//
//    printf("num\tname\tmid\tfin\trep\tatt\n");
//
//    while (!feof(fp)) {
//        fscanf(fp, "%10s %7s %4d %4d %4d %4d \n", no, name, &mid, &term, &rep, &att);
//        printf("%-10s %-8s %4d %4d %4d %4d \n", no, name, mid, term, rep, att);
//    }
//
//    fclose(fp);
//}