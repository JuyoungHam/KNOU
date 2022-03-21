//#include <stdio.h>
//#include <string.h>
//#include <malloc.h>
//
//void main() {
//    char *str[3];
//    char temp[100];
//    int i, j, size;
//    printf("3 sentences : \n");
//    for (i = 0; i < 3; i++) {
//        printf("%d 번째 문자열 : ", i + 1);
//        gets(temp);
//        size = strlen(temp);
//        str[i] = (char *) malloc((sizeof(char) * size) + 1);
//        strcpy(str[i], temp);
//    }
//
//    printf("these are what you wrote\n");
//    for (i = 2; i >= 0; i--) {
//        size = strlen(str[i]);
//        temp[size] = '\0';
//        for (j = size - 1; j >= 0; j--) {
//            temp[size - 1 - j] = str[i][j];
//        }
//        printf("%d : %s \n", i + 1, temp);
//    }
//
//    for (i = 0; i < 3; i++) {
//        free(str[i]);
//    }
//}