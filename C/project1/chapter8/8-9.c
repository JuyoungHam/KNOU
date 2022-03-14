//#include <stdio.h>
//#include <stdlib.h>
//#include <string.h>
//
//void main() {
//    FILE *fp;
//    char name[10];
//    if ((fp = fopen("sample5.dat", "wb")) == NULL) {
//        puts("can not open");
//        exit(1);
//    }
//
//    printf("enter your name and 'end' to eixt.\n");
//
//    gets(name);
//
//    while (strcmp(name, "END")) {
//        fwrite(name, 10, 1, fp);
//        gets(name);
//    }
//
//    fclose(fp);
//}