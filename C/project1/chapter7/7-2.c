//#include <stdio.h>
//
//struct person {
//    char name[8];
//    int age;
//    char sex;
//};
//
//struct department {
//    char deptName[20];
//    struct person person1;
//    struct person person2;
//    struct person person3;
//    int member;
//};
//
//void main() {
//    struct department accounting = {
//            "Accounting",
//            {"hgd", 30, 'M'},
//            {"igj", 35, 'M'},
//            {"hjy", 37, 'F'},
//            3
//    };
//
//    printf("person1 : %s, %d, %c \n", accounting.person1.name, accounting.person1.age, accounting.person1.sex);
//    printf("person2 : %s, %d, %c \n", accounting.person2.name, accounting.person2.age, accounting.person2.sex);
//    printf("person3 : %s, %d, %c \n", accounting.person3.name, accounting.person3.age, accounting.person3.sex);
//    printf("sizeof(department) : %dbyte \n", sizeof(accounting));
//}