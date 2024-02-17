#include<stdio.h>
#include<conio.h>
void main()
{
int j,i,k,a[20],t,n;
printf("welcome in insertion sort:\n");
printf("enter number of element:\n");
scanf("%d",&n);
printf("enter the element of array:\n");
{
for(j=1;j<=n;j++)
scanf("%d",&a[j]);
}
printf("array is:\n");
for(j=1;j<=n;j++)
    printf("%d\n",a[j]);
    printf("sorted array is:\n");
for(j=2;j<=n;j++)
{
    k=a[j];
    i=j-1;
    while(i>0&&a[i]>k)
    {
         t=a[i];
         a[i+1]=a[i];
         a[i]=t;
         i--;
    }
    a[i+1]=k;
}
for(j=1;j<=n;j++)
    printf("%d\n",a[j]);
getch();
}
