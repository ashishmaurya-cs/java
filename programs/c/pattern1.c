#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,m,n;
printf("enter the number of row:\n");
scanf("%d",&m);
printf("enter the number of colomn:\n");
scanf("%d",&n);
for(i=0;i<m;i++)
{
    for(j=0;j<n;j++)
    {
        printf(" *");
    }
    printf("\n");
}
}
