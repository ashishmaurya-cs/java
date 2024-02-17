#include<stdio.h>
#include<conio.h>
void main()
{
    int i,j,t,s,r,n,a[20];
printf("enter the number of element:\n");
scanf("%d",&n);
printf("enter element of array:\n");
for(i=1;i<=n;i++)
    scanf("%d",&a[i]);
printf("array is:\n");
for(i=1;i<=n;i++)
   {
        printf("%d\n",a[i]);
   }
   printf("press any key for results:");
   scanf("%d",&r);
    for(j=1;j<=n-1;j++)
    {
    s=j;
    for(i=j+1;i<=n;i++)
   {
     if(a[i]<a[s]){
        s=i;
     }

   }
       t=a[j];
        a[j]=a[s];
        a[s]=t;
    }
    printf("sorted array is:\n");
    for(j=1;j<=n;j++)
        printf("%d\n",a[j]);
    getch();

}
