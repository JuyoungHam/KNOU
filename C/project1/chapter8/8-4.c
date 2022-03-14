//#include <stdio.h>
//#include <stdlib.h>
//
//void main() {
//    FILE *fp;
//    char no[10], name[10];
//    int mid, term, rep, att, i;
//    fp = fopen("sample3.txt", "w");
//
//    if (fp == NULL) {
//        printf("can not open");
//        exit(1);
//    }
//
//    fprintf(stdout, "num name mid fin rep att : \n");
//
//    for (i = 0; i < 3; ++i) {
//        scanf("%s %s %d %d %d %d", no, name, &mid, &term, &rep, &att);
//        fprintf(fp, "%-10s %-8s %3d %3d %3d %3d \n", no, name, mid, term, rep, att);
//    }
//}