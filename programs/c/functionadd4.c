#include<stdio.h>
#include<conio.h>
void main()
{
int x ,y,z;
int add(int,int);
printf("Enter two numbers:\n");
scanf("%d%d",&x,&y);
z=add(x,y);
printf("sum of two numbers=%d",z);
getch();
}
int add(int a,int b)
{
    int c;
    c=a+b;
    return c;
}
