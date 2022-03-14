//#include <stdio.h>
//
//void main() {
//    long pos;
//    int i;
//    FILE *fp = fopen("sample7.txt", "wt");
//    fputs("1234#", fp);
//    fclose(fp);
//
//    fp = fopen("sample7.txt", "rt");
//    for (i = 0; i < 4; i++) {
//        putchar(fgetc(fp));
//        pos = ftell(fp);
//        fseek(fp, -1, SEEK_END);
//        putchar(fgetc(fp));
//        fseek(fp, pos, SEEK_SET);
//    }
//
//    fclose(fp);
//
//}