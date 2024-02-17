#include<stdio.h>
#include<conio.h>
void main()
{
    int a,b,y,n;
    void swap(int*,int*);
    printf("welcome in swapping:\n");

        printf("enter two number:");
    scanf("%d%d",&a,&b);
    swap(&a,&b);
    printf("swapped number are=%d %d\n",a,b);
    printf("Thanks for visit here!");
    getch();

}
void swap(int *x,int *y)
{
    int s;
    s=*x;
    *x=*y;
    *y=s;
}
