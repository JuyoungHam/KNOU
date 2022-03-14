//#include <stdio.h>
//#include <stdlib.h>
//
//void main() {
//    FILE *fp;
//    char name[10];
//    if ((fp = fopen("sample5.dat", "rb")) == NULL) {
//        puts("can not open");
//        exit(1);
//    }
//
//    while (1) {
//        if (fread(name, 10, 1, fp) != 1) break;
//        puts(name);
//    }
//
//    fclose(fp);
//}