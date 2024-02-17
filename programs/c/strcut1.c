#include<stdio.h>
#include<conio.h>

void main()
{
    struct date
{
    int d,m,y;
};
    struct date t1;
    printf("welcome in structure:\n");
    printf("enter today date:\n");
    scanf("%d/%d/%d",&t1.d,t1.m,t1.y);
    printf("date:%d/%d/%d",t1.d,t1.m,t1.y);
    getch();
}
