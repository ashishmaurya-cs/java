#include<stdio.h>
#include<conio.h>
void main()
{
 int i,j;
 printf("welcome in break keyword:\n");
 printf("enter term until you want to print:\n");
 scanf("%d",&j);
 for(i=1;i<=1000000000;i++)
 {
     printf("%d, ",i);
     if(i==j)
     {
         break;
     }
 }
 printf("Thanks for visit here!");
}
