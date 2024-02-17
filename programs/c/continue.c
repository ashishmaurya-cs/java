#include<stdio.h>
#include<conio.h>
void main()
{
    int n, i;
    printf("welcome in continue keyword:\n");
    printf("enter term until you want to print even number:\n");
    scanf("%d",&n);
    printf("even numbers are:\n");
    for(i=1;i<=n;i++)
    {
        if(i%2==1)
        {
            continue;
        }
        printf("%d ",i);
    }
}
