#include<stdio.h>
#include<conio.h>
void main()
{
    int n, i,j, a[20],t,s;
printf("welcome in insertion sort:\n");
printf("enter the number of element:\n");
scanf("%d",&n);
printf("enter the element of array:\n");
for(i=1;i<=n;i++)
    scanf("%d",&a[i]);
printf("array is:\n");
for(i=1;i<=n;i++)
    printf("%d\n",a[i]);
    printf("enter s for results:\n");
    scanf("%d",&s);
for(i=1;i<=n;i++)
{
   for(j=n;j>=i+1;j--)
   {
       if(a[j]<a[j-1])
       {
           t=a[j];
           a[j]=a[j-1];
           a[j-1]=t;
       }
   }
}
printf("sorted array is:\n");
for(i=1;i<=n;i++)
    printf("%d\n",a[i]);
getch();
}
