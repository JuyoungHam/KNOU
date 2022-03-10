//#include <stdio.h>
//
//struct student {
//    char name[10];
//    int kor;
//    int math;
//};
//
//void main() {
//    struct student hs[4] = {
//            {"kim hg", 90, 95},
//            {"lee sy", 85, 90},
//            {"park gs", 70, 85},
//            {"choi hj", 95, 75}
//    };
//    struct student *p;
//    p = hs;
//
//    printf("%s, %d %d \n", p->name, p->kor, p->math);
//    p += 3;
//
//    printf("%s, %d %d \n", p->name, p->kor, p->math);
//
//    p--;
//    printf("%s, %d %d \n", p->name, p->kor, p->math);
//
//}