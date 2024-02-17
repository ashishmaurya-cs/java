
#include<stdio.h>
#include<conio.h>

void main()
{
    int line;
    int fact(int);
    int com(int,int);
    void ppascal(int);
    printf("welcome in pascal:\n");
    printf("enter number of line:\n");
    scanf("%d",&line);
    ppascal(line);
    printf("Thanks for visit here!");

}
int fact(int n)
{
    int f;
    if(n==1)
    {
        return 1;
    }
    else
    {
      f=n*fact(n-1);
      return f;
    }
}
int com(int n,int r)
{
    return(fact(n)/fact(n-r)/fact(r));
}
void ppascal(int line)
{
    int i,j,k,r;
    for(i=1;i<=line;i++)
    {
        k=1;r=0;
        for(j=1;j<=2*line-1;j++)
        {
            if(j>=line+1-i && j<=line-1+i &&k)
            {
                printf("%d",com(i-1,r));
                k=0;
                r++;
            }
            else
            {
                printf(" ");
                k=1;
            }
        }
        printf("\n");
    }
}
