#include<stdio.h>
#include<conio.h>
 void main()
{
    int n,i,fact=1;
    printf("enter a number:\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    fact=fact*i;
printf("factorial of number =%d",fact);
    getch();
}
