//#include <stdio.h>
//
//void main() {
//    char str[10];
//    FILE *fp = fopen("sample6.txt", "wt");
//    fputs("1234567890", fp);
//    fclose(fp);
//    fp = fopen("sample6.txt", "rt");
//    fseek(fp, 7, SEEK_SET);
//    fgets(str, 4, fp);
//    printf("3 letters from 7'th : %s \n", str);
//    fseek(fp, -2, SEEK_CUR);
//    fgets(str, 3, fp);
//    printf("2 front letters from current index : %s \n", str);
//    fseek(fp, -9, SEEK_END);
//    fgets(str, 6, fp);
//    printf("%s \n", str);
//    fclose(fp);
//}