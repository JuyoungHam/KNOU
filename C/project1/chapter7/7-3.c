//#include <stdio.h>
//
//void main() {
//    struct person {
//        char *name;
//        int age;
//        char sex;
//    };
//
//    struct person X[3] = {
//            {"hgd", 20, 'M'},
//            {"hjy", 22, 'F'},
//            {"ygj", 30, 'M'}
//    };
//
//    int i, sum = 0;
//    for (i = 0; i < 3; i++) {
//        printf("%s\t%d\t%c\n", X[i].name, X[i].age, X[i].sex);
//        sum += X[i].age;
//    }
//    printf("sum : %d \n", sum);
//}