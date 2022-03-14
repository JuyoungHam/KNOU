//#include <stdio.h>
//#include <stdlib.h>
//#include <string.h>
//
//void main() {
//    char name[64];
//    FILE *fp;
//    if ((fp = fopen("sample2.txt", "w")) == NULL) {
//        puts("can not open");
//        exit(1);
//    }
//
//    printf("input yor name and 'end' to exit\n");
//    gets(name);
//
//    while (strcmp(name, "end")) {
//        strcat(name, "\n");
//        fputs(name, fp);
//        gets(name);
//    }
//    fclose(fp);
//}