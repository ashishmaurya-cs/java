#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,*m,*n,*c;
    printf("welcome in pointer arithmetic:\n");
    printf("enter three number:\n");
    scanf("%d%d%d",&a,&b,&c);
    printf("%u\n",&a);
    printf("%u\n",&b);
    printf("%u\n",&c);
    printf("%u\n",&a-&b);//subtraction of two pointer.
    m=&a;
    m=m+2;//add integer to pointer .
    printf("%u\n",m);
    n=&b;
    n=n-3;
    printf("%u\n",n);//sub of integer from pointer.
 getch();

}
