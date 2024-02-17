#include<stdio.h>
#include<conio.h>

int build_max(int a[20] ,int n );
int  max_heapify(int a[20],int n);
int heap_sort(int a[20],int n);
void main()
{
int i,a[20],j,n;
printf("welcome in heap sort:\n");
printf("enter the number of element:\n");
scanf("%d",&n);
printf("enter the element of array:\n");
for(i=1;i<=n;i++)
{
    scanf("%d",&a[i]);
}
printf("entered array is:\n");
for(i=1;i<=n;i++)
{
      printf("%d\n",a[i]);
}
heap_sort(a[20],n);
printf("sorted array is:\n");
for(j=1;j<=n;j++)
{
    printf("%d ",a[j]);
}
getch();
}

int heap_sort(int a[20],int n)
{
int j,temp;

    build_max(a[20],n);
    for(j=n;j>=2;j--)
    {


            temp=a[1];
            a[1]=a[j];
            a[j]=temp;

        n--;
        max_heapify(a[n],1);
    }
    return a[j];
    }


int build_max(int a[20],int n)
{
    int j;
    for(j=n/2;j>=1;j--)
    {
         max_heapify(a[20],j);
    }
    return (a[20]);
}
int max_heapify(int a[20],int j)
{
    int largest,l,n,t,r;
    l=2*j;
    r=2*j+1;
    if(l<=n&&a[l]>a[j])
    {
        largest=l;
    }
    else
        {
        largest=j;
        }
    if(r<=n&&a[r]>a[largest])
    {
        largest=r;
    }
    if(j!=largest)
    {
        t=a[j];
        a[j]=a[largest];
        a[largest]=t;
        max_heapify(a[20],largest);
    }
return(a[20]);
}






