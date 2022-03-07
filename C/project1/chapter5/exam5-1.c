//#include <stdio.h>
//
//char upper(char);
//
//char lower(char);
//
//void main() {
//    char in_s[50];
//    char out_s[50];
//    char ch;
//    int i = 0;
//    printf("문자열을 입력하시오 : \n");
//    scanf("%s", in_s);
//    ch = in_s[i];
//    while (ch != '\0') {
//        if (ch >= 'A' && ch <= 'Z') {
//            out_s[i] = lower(ch);
//        } else if (ch >= 'a' && ch <= 'z') {
//            out_s[i] = upper(ch);
//        } else {
//            out_s[i] = ch;
//        }
//        i++;
//        ch = in_s[i];
//    }
//
//    out_s[i] = '\0';
//    printf("result : %s \n", out_s);
//}
//
//char upper(char ch) {
//    return ch - 32;
//}
//
//char lower(char ch) {
//    return ch + 32;
//}