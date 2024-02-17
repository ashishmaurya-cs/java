#include<stdio.h>
#include<conio.h>
void main()
{
    int m=10,*n;
    printf("%d\n",m);
    printf("%d\n",&m);
    n=&m;
    printf("%u\n",*n);
    getch();
}
