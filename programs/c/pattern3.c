#include<stdio.h>
#include<conio.h>
void main()
{
    int i,m,n,j;
    printf("enter the number of row:\n");
    scanf("%d",&m);
    printf("enter the number of colomun:\n");
    scanf("%d",&n);
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i<=j)
            {
                printf("*");
            }
            else
            {
                printf("");
            }
        }
        printf("\n");
    }
    getch();
}

