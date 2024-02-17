#include<stdio.h>
#include<conio.h>
void main()
{
    int n;
    int fact(int);
    printf("welcome in factorial world:\n");
    printf("enter the number");
    scanf("%d",&n);
    int s=fact(n);
    printf("factorial is=%d",s);
    getch();
}
int fact(int n)
{int f;
if(n==1)
{
   return 1;
}else
{
      f=n*fact(n-1);
    return f;
}
}
