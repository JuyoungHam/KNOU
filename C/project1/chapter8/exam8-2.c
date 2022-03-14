//#include <stdio.h>
//#include <stdlib.h>
//
//void clear_keyboard(void);
//
//void main() {
//    FILE *fp;
//    float data[5];
//    int count;
//    char filename[20];
//    puts("\n5 float numbers : ");
//    for (count = 0; count < 5; count++) {
//        scanf("%f", &data[count]);
//    }
//
//    clear_keyboard();
//
//    puts("\nfile name : ");
//    gets(filename);
//
//    if ((fp = fopen(filename, "w")) == NULL) {
//        fprintf(stderr, "error opening file %s.", filename);
//        exit(1);
//    }
//
//    for (count = 0; count < 5; count++) {
//        fprintf(fp, "\ndata[%d] = %8.3f", count, data[count]);
//        fprintf(stdout, "\ndata[%d] = %8.3f", count, data[count]);
//    }
//
//    fclose(fp);
//    printf("\n");
//}
//
//void clear_keyboard(void) {
//    char junk[80];
//    gets(junk);
//}