#include<stdio.h>
#include<conio.h>
void main()
{int r,n;
printf("welcome in combination:\n");
printf("enter number n:");
scanf("%d",&n);
printf("enter number r:");
scanf("%d",&r);
    int s=comb(n,r);
    printf("%d\n",s);
    printf("Thanks for visit here:\n");
}
int fact(int n)
{
     int f=1;
    while(n>=1)
    {
        f=f*n;
        n--;
    }
    return f;
}
int comb(int n,int r)
{
    return(fact(n)/fact(n-r)/fact(r));
}
